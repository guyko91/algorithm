package baekjoon.step17;

// 수열

// 첫째 줄에는 두 개의 정수 N과 K가 한 개의 공백을 사이에 두고 순서대로 주어진다.
// 첫 번째 정수 N은 온도를 측정한 전체 날짜의 수이다.
// N은 2 이상 100,000 이하이다. 두 번째 정수 K는 합을 구하기 위한 연속적인 날짜의 수이다.
// K는 1과 N 사이의 정수이다.
// 둘째 줄에는 매일 측정한 온도를 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 이 수들은 모두 -100 이상 100 이하이다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 첫째 줄에는 입력되는 온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값을 출력한다.
public class No2559 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(r.readLine(), " ");

        int N = Integer.parseInt(tk.nextToken());
        int K = Integer.parseInt(tk.nextToken());

        int[] arr = new int[N];
        int[] prefix_sum = new int[N+1];

        tk = new StringTokenizer(r.readLine(), " ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tk.nextToken());
        }

        for(int i = 1; i <= N; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i-1];
        }

//        System.out.println(Arrays.toString(prefix_sum));

        int[] arr2 = new int[N - K + 1];
        for(int i = 1; i + K - 1 < prefix_sum.length; i++){
            int a = i;
            int b = i+K-1;
            arr2[i - 1] = prefix_sum[b] - prefix_sum[a - 1];
        }

        Arrays.sort(arr2);

        System.out.println(arr2[arr2.length - 1]);

        r.close();
    }
}
