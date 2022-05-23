package baekjoon.step12;

// 숫자 카드 2

// 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
// 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
// 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다.
// 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
public class No10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int target = sc.nextInt();
            map.merge(target, 1, Integer::sum);
        }

        int M = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < M; i++) {
            int target = sc.nextInt();
            if(map.get(target) != null) {
                builder.append(map.get(target));
            }else {
                builder.append("0");
            }
            builder.append(" ");
        }

        System.out.println(builder);
        sc.close();
    }
}
