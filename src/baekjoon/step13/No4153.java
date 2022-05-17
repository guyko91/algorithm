package baekjoon.step13;

// 직각 삼각형

import java.util.Scanner;

// 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
// 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
public class No4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";

        while (true) {
            input = sc.nextLine();
            if(input.equals("0 0 0")) {
                break;
            }
            if(isTriangle(input)) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }

        sc.close();
    }

    public static boolean isTriangle(String input) {
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        int c = Integer.parseInt(input.split(" ")[2]);

        if(a > b && a > c) {
            return a*a == (b*b) + (c*c);
        }else if(b > a && b > c) {
            return b*b == (a*a) + (c*c);
        }else {
            return c*c == (b*b) + (a*a);
        }
    }
}
