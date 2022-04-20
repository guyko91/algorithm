package baekjoon.step3;

import java.io.*;

public class No11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        for(int i = 1; i <= T; i++) {
            StringBuilder token = new StringBuilder();
            for(int k = 0; k < i; k++) {
                token.append("*");
            }
            writer.write(token +"\n");
        }

        writer.flush();
    }
}
