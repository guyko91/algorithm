package baekjoon.step11;

import java.io.*;
import java.util.*;

// 단어 정렬
public class No1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(r.readLine());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++) {
            arr[i] = r.readLine();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1.length() == e2.length()) {
                return e1.compareTo(e2);
            }else {
                return e1.length() - e2.length();
            }
        });

        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                w.write(arr[i] + "\n");
            }else {
                if(!arr[i - 1].equals(arr[i])) {
                    w.write(arr[i] + "\n");
                }
            }
        }

        w.flush();
        w.close();
        r.close();
    }
}
