package baekjoon.step13;

import java.util.Scanner;

// 하키
public class No1358 {

    public static int W,H,X,Y,R,P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 가로
        W = sc.nextInt();
        // 세로
        H = sc.nextInt();
        // X 좌표
        X = sc.nextInt();
        // Y 좌표
        Y = sc.nextInt();
        // 반지름
        R = Y/2;
        // 사람 수
        P = sc.nextInt();
        sc.nextLine();

        int cnt = 0;
        for(int i = 0; i < P; i++) {
            String input = sc.nextLine();
            int x = Integer.parseInt(input.split(" ")[0]);
            int y = Integer.parseInt(input.split(" ")[1]);
            if(isIn(x,y)) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }

    public static boolean isIn(int a, int b) {

        if ((a - X)*(a - X) + (b - (Y + H / 2))*(b - (Y + H / 2)) <= (H / 2)*(H / 2) && a < X)
            return true;
        else if (X <= a&&a <= X + W&&Y <= b&&b <= Y + H)
            return true;
        else return (a - (X + W)) * (a - (W + X)) + (b - (Y + H / 2)) * (b - (Y + H / 2)) <= (H / 2) * (H / 2) && X + W < a;
    }
}
