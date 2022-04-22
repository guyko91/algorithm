package baekjoon.step6;

import java.io.*;

// 숫자의 합
// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int caseCnt = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split("");

        int sum = 0;
        for(int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }

        System.out.println(sum);
        r.close();

    }
}
