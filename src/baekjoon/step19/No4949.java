package baekjoon.step19;

import java.util.Scanner;
import java.util.Stack;

// 균형잡힌 세상
public class No4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ( -> 40
        // ) -> 41
        // [ -> 91
        // ] -> 93
//        System.out.println((int)"]".charAt(0));

        while(true) {
            String input = sc.nextLine();
            if(input.equals(".")) {
                break;
            }
            System.out.println(check(input));
        }
    }

    public static String check(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            int s = input.charAt(i);

            if(s == 40 || s == 41 || s == 91 || s == 93) {
                if(stack.empty() && (s == 41 || s == 93)) {
                    return "no";
                }
                else if(stack.empty() && (s == 40 || s == 91)) {
                    stack.push(a);
                }
                else if(
                        ((int)stack.lastElement() == 40 && s == 41) ||
                                ((int)stack.lastElement() == 91 && s == 93)
                ) {
                    stack.pop();
                }
                else {
                    stack.push(a);
                }
            }
        }

        if(stack.empty()) {
            return "yes";
        }else {
           return "no";
        }
    }

}
