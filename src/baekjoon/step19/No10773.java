package baekjoon.step19;

import java.util.Arrays;
import java.util.Scanner;

// 제로
// 첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)
// 이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
// 정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
public class No10773 {

    public static int[] arr;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        arr = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            int input = sc.nextInt();
            if(input != 0) {
                push(input);
            }else {
                pop();
            }
        }

        System.out.println(Arrays.stream(arr).sum());
        sc.close();
    }

    public static void push(int a) {
        arr[size] = a;
        size++;
    }

    public static void pop() {
        if(size != 0) {
            int last = arr[size - 1];
            arr[size - 1] = 0;
            size--;
        }
    }
}
