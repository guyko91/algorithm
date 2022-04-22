package baekjoon.step6;

import java.io.*;

// 알파벳 찾기
// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class No10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String input = r.readLine();

        for(String a : alphabet) {
            w.write(input.indexOf(a) + " ");
        }

        w.flush();
        r.close();
        w.close();
    }
}
