package baekjoon.step14;

import java.util.Scanner;

// 다리 놓기 (조합 공식)
// TODO 메모이제이션을 이용한 동적 계획법
public class No1010 {

    // 최대 입력값 29이므로,
    public static int[][] dp = new int[30][30];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < cases; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            builder.append(combi(M, N)).append("\n");
        }

        System.out.println(builder);
        sc.close();
    }

    static int combi(int n, int r) {

        // 이미 풀린 경우 바로 반환
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        // 2번 성질
        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 1번 성질
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}
