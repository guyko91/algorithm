package baekjoon.step7;

import java.util.Scanner;

// 분수찾기
public class No1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int crossCount = 1, prev_count_sum = 0;

        while (true) {

            if(X <= prev_count_sum + crossCount) {
                if(crossCount %2 == 1) {
                    // 대각선 개수가 홀수
                    System.out.println((crossCount - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }else {
                    // 대각선 개수 짝수
                    System.out.println((X - prev_count_sum) + "/" + (crossCount - (X - prev_count_sum -1)));
                    break;
                }
            }else {
                prev_count_sum += crossCount;
                crossCount++;
            }
        }

    }
}
