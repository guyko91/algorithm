package baekjoon.step3;

import java.io.*;

public class No2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            writer.write((n-i) + "\n");
        }

        writer.flush();
    }
}
