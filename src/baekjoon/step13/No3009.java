package baekjoon.step13;

// 네 번째 점

import java.util.Scanner;

// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
public class No3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] horizon = new int[3];
        int[] vertical = new int[3];

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            horizon[i] = Integer.parseInt(input.split(" ")[0]);
            vertical[i] = Integer.parseInt(input.split(" ")[1]);
        }

        int x = 0;
        int y = 0;

        if(horizon[0] == horizon[1]) {
            x = horizon[2];
        }else {
            if(horizon[1] == horizon[2]) {
                x = horizon[0];
            }else {
                x = horizon[1];
            }
        }

        if(vertical[0] == vertical[1]) {
            y = vertical[2];
        }else {
            if(vertical[1] == vertical[2]) {
                y = vertical[0];
            }else {
                y = vertical[1];
            }
        }

        System.out.println(x + " " + y);

        sc.close();
    }
}
