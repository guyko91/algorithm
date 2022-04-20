package baekjoon.step3;

import java.io.*;

// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class No2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        for(int i = 1; i <= n; i++) {
            writer.write(i + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }

}
