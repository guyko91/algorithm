package baekjoon.step1;

import java.util.Scanner;

// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
public class No10869 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        a = Integer.parseInt(in.split(" ")[0]);
        b = Integer.parseInt(in.split(" ")[1]);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
