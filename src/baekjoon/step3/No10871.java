package baekjoon.step3;

import java.io.*;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String init = reader.readLine();
        int N = Integer.parseInt(init.split(" ")[0]);
        int X = Integer.parseInt(init.split(" ")[1]);

        String input = reader.readLine();
        for(String s : input.split(" ")) {
            if(Integer.parseInt(s) < X) {
                writer.write(s + " ");
            }
        }

        writer.flush();
    }
}
