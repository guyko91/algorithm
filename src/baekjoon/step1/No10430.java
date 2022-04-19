package baekjoon.step1;

import java.util.Scanner;

// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
public class No10430 {
    public static void main(String[] args) {
        int A,B,C;
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        A = Integer.parseInt(in.split(" ")[0]);
        B = Integer.parseInt(in.split(" ")[1]);
        C = Integer.parseInt(in.split(" ")[2]);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
