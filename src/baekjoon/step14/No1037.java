package baekjoon.step14;

// 약수
// 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

import java.util.*;

// 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
// 첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.
public class No1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        if (cnt == 1) {
            int a = sc.nextInt();
            System.out.println(a*a);
        } else {
            // input 중 가장 작은 수와 가장 큰 수를 곱한다.
            int[] arr = new int[cnt];
            for(int i = 0; i < cnt; i++) {
                arr[i] = sc.nextInt();
            }

            // 오름차 순 정렬
            Arrays.sort(arr);

            // 최소값과 최대값의 곱을 출력
            System.out.println(arr[0] * arr[cnt-1]);
        }

        sc.close();
    }
}