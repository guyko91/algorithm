package baekjoon.step10;

// 체스판 다시 칠하기

// 첫째 줄에 N과 M이 주어진다.
// N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
// 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

import java.io.*;
import java.util.Arrays;

// 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
public class No1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = r.readLine();
        int M = Integer.parseInt(input.split(" ")[0]);
        int N = Integer.parseInt(input.split(" ")[1]);

        String[][] arr = new String[M][N];



        w.flush();
        w.close();
        r.close();
    }
}
