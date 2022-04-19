package baekjoon.step1;

import java.util.Scanner;

// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
public class No2588 {
    public static void main(String[] args) {
        int a,b1,b2,b3;
        String b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.next();

        b1 = Integer.parseInt(b.split("")[2]);
        b2 = Integer.parseInt(b.split("")[1]);
        b3 = Integer.parseInt(b.split("")[0]);

        System.out.println(a*b1);
        System.out.println(a*b2);
        System.out.println(a*b3);
        System.out.println((a*b1)+(a*b2*10)+(a*b3*100));
    }
}
