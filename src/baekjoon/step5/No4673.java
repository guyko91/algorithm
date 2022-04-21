package baekjoon.step5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 셀프 넘버
public class No4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 1; i < 100; i++) {
            w.write(d(i) + "\n");
        }
        w.flush();
        w.close();
    }

    public static int d(int n) {
        int returnVal = 0;
        if (n < 100) {
            returnVal = ((n/10)*10)+(n%10);
        } else if (n < 1000) {
            returnVal = ((n/100)*100) + ((n/10)*10) + (n%10);
        } else if (n < 10000) {
            returnVal = ((n/1000)*1000) + ((n/100)*100) + ((n/10)*10) + (n%10);
        }
        return n + returnVal;
    }
}
