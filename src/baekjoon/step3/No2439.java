package baekjoon.step3;

import java.io.*;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        for(int i = 1; i <= T; i++) {
            StringBuilder token = new StringBuilder();
            for(int k = T; k > 0; k--) {
                if(i >= k) {
                    token.append("*");
                }else {
                    token.append(" ");
                }
            }
            writer.write(token +"\n");
        }

        writer.flush();
    }
}
