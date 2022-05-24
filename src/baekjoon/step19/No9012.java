package baekjoon.step19;

// 괄호

import java.util.Scanner;
import java.util.Stack;

// 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다.
public class No9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < cnt; i++) {
            System.out.println(solve(sc.nextLine()));
        }
        sc.close();
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            }
            else if(stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }

        if(stack.empty()) {
            return "YES";
        }else {
            return "NO";
        }

    }
}
