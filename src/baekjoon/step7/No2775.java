package baekjoon.step7;

import java.io.*;

// 부녀회장이 될테야
// 평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.
// 이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
// 아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
// 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
public class No2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCnt = Integer.parseInt(r.readLine());

        for(int i = 0; i < caseCnt; i++) {
            int a = Integer.parseInt(r.readLine());
            int b = Integer.parseInt(r.readLine());

            w.write(sum(a,b) + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }

    public static int sum(int a, int b) {
        int[] targetArr = new int[b];
        for(int i = 0; i <= a; i++) {
            int[] belowArr = new int[b];
            for(int j = 1; j <= b; j++) {
                if(i == 0) {
                    belowArr[j-1] = j;
                }else {
                    belowArr[j-1] = floorSum(targetArr, j);
                }
            }
            targetArr = belowArr;
        }
        return targetArr[b-1];
    }

    public static int floorSum(int[] belowArr, int index) {
        int result = 0;
        for(int i = 0; i < index; i++) {
            result += belowArr[i];
        }
        return result;
    }
}
