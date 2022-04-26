package baekjoon.step7;

// 벌집
// 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
// 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.

import java.util.Scanner;

// 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
public class No2292 {
    public static void main(String[] args) {

        // 1 : 1
        // 2 ~ 7 : 6
        // 8 ~ 19 : 12
        // 20 ~ 37 : 18
        // 38 ~ 61 : 24

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int range = 2;
        sc.close();

        if(N == 1) {
            System.out.println("1");
        }else {
            while(range <= N) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
