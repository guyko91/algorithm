package baekjoon.step11;

import java.io.*;

// 통계학

// 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

// 산술평균 : N개의 수들의 합을 N으로 나눈 값
// 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
// 최빈값 : N개의 수들 중 가장 많이 나타나는 값
// 범위 : N개의 수들 중 최댓값과 최솟값의 차이
// N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
public class No2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(r.readLine());

        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;

        for(int i = 0; i < cnt; i++) {
            int value = Integer.parseInt(r.readLine());
            sum += value;
            arr[value + 4000]++;

            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }

        int count = 0;  // 중앙값 빈도 누적 수
        int mod_max = 0;    // 최빈값의 최댓값

        // 이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아니면 false
        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++) {
            if(arr[i] > 0) {

                // 중앙값 찾기
                if(count < (cnt + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                // 최빈값 찾기
                if(mod_max < arr[i]) {
                    mod_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }else if(mod_max == arr[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        w.write((int)Math.round((double) sum / cnt) + "\n");
        w.write(median + "\n");
        w.write(mode + "\n");
        w.write((max - min) + "\n");

        w.flush();
        w.close();
        r.close();
        
    }
}
