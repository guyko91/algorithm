package baekjoon.step12;

// 서로 다른 부분 문자열의 개수

// 문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
// 부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
// 예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.
// 첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.
public class No11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Set<String> set = new HashSet<>();

        int len = input.length();

        for(int i = 0; i < len; i++) {
            String target = "";
            for(int k = i; k < len; k++ ) {
                target += input.substring(k, k+1);
                set.add(target);
            }
        }

        System.out.println(set.size());
    }
}
