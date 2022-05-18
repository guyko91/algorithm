package baekjoon.step14;

import java.util.Scanner;

// 최대공약수와 최소공배수
public class No2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 최대 공약수
        int d = gcd(a, b);

        // 최소 공배수
        int e = (a * b) / d;

        System.out.println(d);
        System.out.println(e);

        sc.close();
    }

    public static int gcd(int a, int b) {
        if ( b == 0)
            return a;
        return gcd(b, a % b);
    }
}
