package baekjoon.step8;

import java.io.*;

public class No1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = r.readLine();

        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);

        for(int i = a; i <= b; i++) {
            if(isPrime(i)) {
                w.write(i + "\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }else {
            for(int i = 2; i < num; i++) {
                if(num%i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
