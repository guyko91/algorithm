package baekjoon.step11;

import java.util.*;

// 좌표 정렬하기
public class No11650 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();
        int arr[][] = new int[cnt][2];

        // 선택 정렬로 하면 시간초과.

        for(int i = 0; i < cnt; i++ ) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            }else {
                return e1[0] - e2[0];
            }
        });

        for(int i = 0; i < cnt; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        in.close();
    }
}
