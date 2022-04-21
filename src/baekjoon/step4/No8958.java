package baekjoon.step4;

import java.io.*;

// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
// "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        // 주어질 문제의 수
        int cnt = Integer.parseInt(r.readLine());
        String[] arr = new String[cnt];

        for(int i = 0; i < cnt; i++) {
            arr[i] = r.readLine();
        }

        for(String a : arr) {
            int score = 0;
            int plus = 0;
            for(String b : a.split("")) {
                if(b.equals("O")) {
                    score += (plus + 1);
                    plus++;
                }else {
                    plus = 0;
                }
            }
            w.write(score + "\n");
        }

        w.flush();
        r.close();
        w.close();
    }
}
