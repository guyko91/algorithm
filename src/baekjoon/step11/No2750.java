package baekjoon.step11;

import java.util.Scanner;

// 수 정렬하기
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
public class No2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        // 선택정렬 (SELECTION SORT)
        for(int i = 0; i < cnt - 1; i++) {
            for(int j = i + 1; j < cnt; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int a : arr) {
            System.out.println(a);
        }

        // 카운팅 정렬 (COUNTING SORT)
        // range : -1000 ~ 1000
        // 0 은 index[1000] 을 의미
//        boolean[] arr2 = new boolean[2001];

        sc.close();

    }
}