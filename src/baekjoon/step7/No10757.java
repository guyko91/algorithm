package baekjoon.step7;

import java.io.*;

// 큰 수 A+B
// 덧셈을 직접 구현 필요
public class No10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = r.readLine();
        r.close();

        String[] a = input.split(" ")[0].split("");
        String[] b = input.split(" ")[1].split("");

        w.flush();
        w.close();
    }
}
