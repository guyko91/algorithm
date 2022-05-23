package baekjoon.step12;

// 숫자 카드
// 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
// 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

import java.util.*;

// 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
// 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
// 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
// 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
// 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다.
// 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다

public class No10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자카드의 개수
        int N = sc.nextInt();
        int[] cards = new int[N];
        sc.nextLine();

        for(int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards);

        // 체크하야할 개수
        int M = sc.nextInt();
        int[] checks = new int[M];
        sc.nextLine();

        for(int i = 0; i < M; i++) {
            checks[i] = sc.nextInt();
        }

        for(int a : checks) {
            System.out.print(binarySearch(cards, a) + " ");
        }

    }

    public static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start+end)/2;

        while(end-start >= 0) {
            if(array[mid] == target) {
                return 1;
            }else if(array[mid] <= target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
            mid = (end+start) / 2;
        }

        return 0;
    }
}
