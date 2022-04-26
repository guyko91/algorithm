package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 달팽이는 올라가고 싶다.
// 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
// 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
// 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
// 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
public class No2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String input = r.readLine();

        // 낮에 올라갈 수 있는 미터
        int A = Integer.parseInt(input.split(" ")[0]);
        // 밤에 미끄러지는 미터
        int B = Integer.parseInt(input.split(" ")[1]);
        // 총 올라가야하는 미터
        int V = Integer.parseInt(input.split(" ")[2]);

        int day = (V - B) / (A - B);
        if((V - B) % (A-B) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
