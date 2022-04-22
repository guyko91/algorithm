package baekjoon.step5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 셀프 넘버
public class No4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] check = new boolean[10001];

        for(int i = 1; i <= 10000; i++) {
            int n = d(i);

            if (n < 10001) {
                check[n] = true;
            }
        }

        for(int i = 1; i < 10001; i++) {
            if(!check[i]) {
                w.write(i + "\n");
            }
        }

        w.flush();
        w.close();
    }

    public static int d(int n) {
        int sum = n;
        while(n != 0) {
            sum = sum + (n % 10);
            n = n/10;
        }
        return sum;
    }
}
