package baekjoon.step7;

import java.io.*;

// ACM호텔
public class No10250 {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCnt = Integer.parseInt(r.readLine());
        String[] cases = new String[caseCnt];
        for(int i = 0; i < caseCnt; i++) {
            cases[i] = r.readLine();
        }

        for(String c : cases) {
            w.write(func(c) + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }

    public static String func(String c) {

        int floors = Integer.parseInt(c.split(" ")[0]);
        int roomsPerFloor = Integer.parseInt(c.split(" ")[1]);
        int visitorCnt = Integer.parseInt(c.split(" ")[2]);

        // a : 층수 = 나머지
        // b : 방번호 = 몫
        int a;
        int b = (visitorCnt/floors)+1;
        if(visitorCnt % floors == 0) {
            a = floors;
            b--;
        }else {
            a = visitorCnt%floors;
        }

        if(b < 10) {
            return "" + a + "0" + b;
        }else {
            return "" + a + b;
        }
    }

}
