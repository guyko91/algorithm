package baekjoon.step3;

import java.io.*;

public class No11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        for(int i = 1; i <= T; i++) {
            String input = reader.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            writer.write("Case #" + i + ":" + " " + (a+b) + "\n");
        }

        writer.flush();
    }
}
