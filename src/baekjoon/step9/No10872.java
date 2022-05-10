package baekjoon.step9;

// 팩토리얼

import java.util.Scanner;

// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
public class No10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        sc.close();

        int sum = method(input);

        System.out.println(sum);
    }

    public static int method(int input) {
        if(input <= 1) return 1;
        return input * method(input -1);
    }
}
