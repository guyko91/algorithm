package baekjoon.step8;

import java.io.*;
import java.util.*;

// 소수
// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
// 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
public class No2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(r.readLine());
        int N = Integer.parseInt(r.readLine());
        r.close();

        List<Integer> primeList = new ArrayList<>();
        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                primeList.add(i);
            }
        }

        if(primeList.size() != 0) {
            int sum = primeList.stream().mapToInt(a -> a).sum();
            int min = primeList.stream().min(Comparator.comparingInt(value -> value)).get();
            w.write(sum + "\n");
            w.write(min + "\n");
        }else {
            w.write("-1\n");
        }

        w.flush();
        w.close();
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
