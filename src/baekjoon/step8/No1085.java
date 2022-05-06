package baekjoon.step8;

// 직사각형에서 탈출

import java.util.Scanner;

// 한수는 지금 (x, y)에 있다.
// 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
//
// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
public class No1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int x = Integer.parseInt(input.split(" ")[0]);
        int y = Integer.parseInt(input.split(" ")[1]);
        int w = Integer.parseInt(input.split(" ")[2]);
        int h = Integer.parseInt(input.split(" ")[3]);

        // 가로
        int horizontal = Math.min(x, (w - x));

        // 세로
        int vertical = Math.min(y, (h - y));

        System.out.println(Math.min(horizontal, vertical));


    }
}
