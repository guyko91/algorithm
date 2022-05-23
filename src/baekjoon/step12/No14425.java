package baekjoon.step12;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 문자열 집합
// 첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다.
// 다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
// 다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
// 입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않는다. 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.
public class No14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (map.get(str) != null) {
                cnt++;
            }
        }
        bw.write(cnt + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
