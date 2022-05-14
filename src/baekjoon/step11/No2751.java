package baekjoon.step11;

import java.io.*;
import java.util.*;

// 수 정렬하기 2
public class No2751 {
    public static void main(String[] args) throws Exception {
        // 내장 함수를 사용한 정렬
        Scanner sc = new Scanner(System.in);
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < cnt; i++) {
            list.add(sc.nextInt());
        }

        // Arrays.sort는 시간초과 발생.
        // Arrays.sort()는 dual-pivot Quicksort 알고리즘을 사용. (시간복잡도가 O(n^2))

        // Collections.sort()는 Timesort이다. (합병 및 삽입정렬 알고리즘)
        Collections.sort(list);

        for(int a : list) {
            w.write(a + "\n");
        }
        w.flush();
        w.close();
        sc.close();
    }
}
