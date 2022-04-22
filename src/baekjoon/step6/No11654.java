package baekjoon.step6;

import java.io.*;

// 아스키 코드
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class No11654 {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        char a = r.readLine().charAt(0);
        System.out.println((int)a);
    }
}
