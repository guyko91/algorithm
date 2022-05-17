package baekjoon.step13;

// 앵그리 창영

// 첫째 줄에 던진 성냥의 개수 N과 박스의 가로 크기 W와 세로 크기 H가 주어진다. (1 ≤ N ≤ 50, 1 ≤ W, H ≤ 100)
// 다음 N개 줄에는 성냥의 길이가 주어진다. 길이는 1보다 크거나 같고 1000보다 작거나 같은 자연수이다.

import java.util.Scanner;

// 입력으로 주어지는 각각의 성냥에 대해서, 박스안에 들어갈 수 있으면 "DA" 없으면 "NE"를 출력한다.
public class No3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double D = Math.sqrt((W*W)+(H*H));
        for(int a : arr) {
            if (a == W || a == H || a <= D) {
                System.out.println("DA");
            }else {
                System.out.println("NE");
            }
        }
        sc.close();
    }
}
