package baekjoon.step10;

import java.io.*;

// 덩치
// 첫 줄에는 전체 사람의 수 N이 주어진다. 그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.
// 여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.
public class No7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCnt = Integer.parseInt(r.readLine());
        String[] arr = new String[caseCnt];

        for(int i = 0; i < caseCnt; i++) {
            arr[i] = r.readLine();
        }

        int result = 0;
        for(int i = 0; i < caseCnt; i++) {

            int biggerCnt = 0;
            for(int j = 0; j < caseCnt; j++) {
                if(i != j) {
                    int x = Integer.parseInt(arr[i].split(" ")[0]);
                    int y = Integer.parseInt(arr[i].split(" ")[1]);

                    int p = Integer.parseInt(arr[j].split(" ")[0]);
                    int q = Integer.parseInt(arr[j].split(" ")[1]);

                    if(p > x && q > y) {
                        biggerCnt++;
                    }
                }
            }

            w.write((biggerCnt + 1) + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}