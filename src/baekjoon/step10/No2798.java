package baekjoon.step10;

// 블랙잭
import java.util.Scanner;

// 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다.
// 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
// 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
public class No2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String input2 = sc.nextLine();

        sc.close();

        int caseCnt = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        int[] arr = new int[caseCnt];

        int index = 0;
        for(String a : input2.split(" ")) {
            arr[index] = Integer.parseInt(a);
            index++;
        }


        int result = 0;
        for(int i = 0; i < caseCnt-2; i++) {
            for (int j = i+1; j < caseCnt-1; j++) {
                for(int k = j+1; k < caseCnt; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == M) {
                        result = sum;
                        break;
                    }

                    if(result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
