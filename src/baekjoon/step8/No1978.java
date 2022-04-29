package baekjoon.step8;

import java.io.*;

// 소수 찾기
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCnt = Integer.parseInt(r.readLine());
        String[] list = r.readLine().split(" ");
        r.close();

        int cnt = 0;
        for(int i = 0; i < caseCnt; i++) {
            if(isSosu(Integer.parseInt(list[i]))) {
                cnt++;
            }
        }
        w.write(cnt + "\n");
        w.flush();
        w.close();
    }

    public static boolean isSosu(int param) {
        if(param == 1) {
            return false;
        }

        boolean result = true;
        for(int i = 2; i < param; i++) {
            if(param%i == 0) {
                return false;
            }
        }
        return result;
    }
}
