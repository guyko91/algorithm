package baekjoon.step4;

// 나머지
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
// 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.

import java.util.*;

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
// 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        sc.close();

        // TODO 로직 이해 필요.
        int count = 0;
        for(int i = 0; i < 10; i++) {
            int temp = 0;
            for (int j = i; j >= 0; j--) {
                if (arr[i] != arr[j]) {
                    temp++;
                }
            }

            if(temp == i) count++;
        }

        System.out.println(count);

        // map을 사용한 풀이
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int a : arr) {
//            map.put((a%42), 1);
//        }
//        System.out.println(map.entrySet().size());
    }
}
