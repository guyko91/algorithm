package baekjoon.step8;

// 터렛

// 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
// 한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.

import java.util.Scanner;

// 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
public class No1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int T = in.nextInt();

        while (T-- > 0) {

            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();

            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();

            System.out.println(getMatchCnt(x1, y1, r1, x2, y2, r2));
        }
    }

    public static int getMatchCnt(int x1, int y1, int r1, int x2, int y2, int r2) {

        // 두 좌표간의 거리
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 -y1, 2));

        // 완전히 일치하는 경우, 무한대. -1 리턴
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // 접점이 없을 때 : 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때
        else if(distance > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        // 접점이 없을 때 2 : 한 원 안에 다른 원이 있으면 서 접점이 없을 때 (반지름의 차가 두 원 간의 중점 거리보다 클 때)
        else if(distance < Math.pow(r2 - r1, 2) ) {
            return 0;
        }

        // 접점이 한 개 1 (내접할 때) : 두 반지름의 차가 두 좌표간의 차랑 같으면 내접.
        else if(distance == Math.pow(r2 - r1, 2)) {
            return 1;
        }

        // 접점이 한 개 2 (외접할 때) : 두 좌표간의 거리가 두 반지름의 합과 같으면 외접.
        else if(distance == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        return 2;
    }
}
