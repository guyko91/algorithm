package baekjoon.step3;

import java.io.*;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while((input = reader.readLine()) != null && !input.isEmpty()) {
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);

            writer.write((a+b)+"\n");
        }
        writer.flush();
    }
}
