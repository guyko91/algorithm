package baekjoon.step8;

import java.io.*;

public class No1929 {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = r.readLine();

        int M = Integer.parseInt(input.split(" ")[0]);
        int N = Integer.parseInt(input.split(" ")[1]);

        prime = new boolean[N + 1];
        get_prime();

        for(int i = M; i <=N; i++) {
            if(!prime[i]) w.write(i + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }

    public static void get_prime() {
        // true : 소수 아님, false : 소수
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

    }
}
