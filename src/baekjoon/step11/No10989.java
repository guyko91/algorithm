package baekjoon.step11;

import java.io.*;

// 수 정렬하기 3
// 계수 정렬
public class No10989 {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(r.readLine());
        int[] array = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(r.readLine());
        }

        int[] counting = new int[10000000];
        int[] result = new int[N];

        // array의 값을 index로 하는 counting 배열 값을 ++
        for(int i = 0; i < array.length; i++) {
            counting[array[i]]++;
        }

        // counting 배열의 누적합을 구해준다.
        for(int i = 1; i < counting.length; i++) {
            counting[i] += counting[i -1];
        }

        // array의 뒤부터 순회하며, result에 세팅.
        for(int i = array.length - 1; i >= 0; i--) {
            int temp = array[i];
            counting[temp]--;
            result[counting[temp]] = temp;
        }

        for(int a : result) {
            w.write(a + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
