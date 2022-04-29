package baekjoon.step8;

import java.io.*;
import java.util.*;

// 소인수분해
// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
public class No11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(r.readLine());
        r.close();

        if (N != 1) {
            int a = N;
            List<Integer> list = new ArrayList<>();
            while(true) {
                int minPrime = getMinPrimeNum(a);
                if(minPrime == 1) {
                    break;
                }else {
                    a = a/minPrime;
                    list.add(minPrime);
                }
            }

            list.sort(Comparator.comparingInt(value -> value));
            for(int i : list) {
                w.write(i + "\n");
            }
        }
        w.flush();
        w.close();
    }

    public static int getMinPrimeNum(int num) {
        int result = 1;
        for(int i = 2; i <= num; i++) {
            if(num%i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
