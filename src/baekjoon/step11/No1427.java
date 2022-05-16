package baekjoon.step11;

// 소트 인사이드

import java.util.Scanner;

// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
// 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
// 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
public class No1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split("");

        for(int i = 0; i < arr.length - 1; i++) {
            int max = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(Integer.parseInt(arr[max]) < Integer.parseInt(arr[j])) {
                    max = j;
                }
            }

            int temp = Integer.parseInt(arr[max]);
            arr[max] = arr[i];
            arr[i] = String.valueOf(temp);
        }

        for(String a : arr) {
            System.out.print(a);
        }

        sc.close();
    }
}
