package baekjoon.step7;

import java.io.*;

// 큰 수 A+B
// 자바에서 제공하는 BigInteger 를 사용하면 몇줄이면 끝남.
public class No10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = r.readLine();
        r.close();

        String inputA = input.split(" ")[0];
        String inputB = input.split(" ")[1];

        String[] a = inputA.split("");
        String[] b = inputB.split("");
        if(inputA.length() != inputB.length()) {
            if(inputA.length() > inputB.length()) {
                a = inputA.split("");
                b = inputB.split("");
            }else {
                a = inputB.split("");
                b = inputA.split("");
            }
        }

        String result = "";
        // b와의 연산 횟수.
        int cnt = 1;
        // 합이 10이 넘어 다음 자리수로 넘겨주는 값.
        int add = 0;
        for(int i = a.length -1; i >= 0; i--) {
            int sum = 0;
            if (cnt <= b.length) {
                 // b와 연산
                 sum = Integer.parseInt(a[i]) + Integer.parseInt(b[b.length - cnt]) + add;
            }else {
                // add와 a값만 연산
                sum = sum + Integer.parseInt((a[i])) + add;
            }

            if(sum >= 10) {
                add = 1;
                sum = sum - 10;
            }else {
                add = 0;
            }

            result = sum + result;
            cnt++;
        }

        if(add != 0) {
            result = add + result;
        }

        w.write(result + "\n");

        w.flush();
        w.close();
    }
}
