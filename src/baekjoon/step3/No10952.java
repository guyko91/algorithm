package baekjoon.step3;

import java.io.*;
import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 입력의 마지막에는 0 두 개가 들어온다.
public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while(!input.equals("0 0")) {
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            writer.write((a+b) + "\n");

            input = sc.nextLine();
        }

        writer.flush();
    }
}
