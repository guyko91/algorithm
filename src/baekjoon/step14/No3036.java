package baekjoon.step14;

// 링

import java.util.Scanner;

// 첫째 줄에 링의 개수 N이 주어진다. (3 ≤ N ≤ 100)
// 다음 줄에는 링의 반지름이 상근이가 바닥에 놓은 순서대로 주어진다. 반지름은 1과 1000를 포함하는 사이의 자연수이다.
// 출력은 총 N-1줄을 해야 한다. 첫 번째 링을 제외한 각각의 링에 대해서, 첫 번째 링을 한 바퀴 돌리면 그 링은 몇 바퀴 도는지 기약 분수 형태 A/B로 출력한다.
public class No3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];
        for(int i = 1; i < arr.length; i++) {
            int b = arr[i];
            // 최대공약수
            int c = gcd(a,b);
            System.out.println(a/c + "/" + b/c);
        }

        sc.close();
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

}
