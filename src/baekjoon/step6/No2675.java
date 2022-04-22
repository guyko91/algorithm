package baekjoon.step6;

import java.io.*;

// 문자열 반복
// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCnt = Integer.parseInt(r.readLine());
        String[] cases = new String[caseCnt];

        for(int i = 0; i < caseCnt; i++) {
            cases[i] = r.readLine();
        }

        for(String a : cases) {
            int n = Integer.parseInt(a.split(" ")[0]);
            String ex = a.split(" ")[1];

            StringBuilder builder = new StringBuilder();
            for(String e : ex.split("")) {
                for(int i = 1; i <= n; i++) {
                    builder.append(e);
                }
            }
            w.write(builder.toString() + "\n");
        }

        w.flush();
        r.close();
        w.close();

    }
}
