package baekjoon.step1;

import java.util.Scanner;

// A+B
// 두 정수 A와 B를 입력받고 A-B를 출력하는 프로그램.
public class No1001 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        a = Integer.parseInt(in.split(" ")[0]);
        b = Integer.parseInt(in.split(" ")[1]);
        System.out.println(a-b);
    }
}
