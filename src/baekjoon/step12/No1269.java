package baekjoon.step12;

// 대칭 차집합
// 첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다.
// 둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다.
// 각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// TODO Set 활용해서 다시 풀어보기
// 첫째 줄에 대칭 차집합의 원소의 개수를 출력한다.
public class No1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0; i < A; i++) {
            map.put(sc.nextInt(), 1);
        }

        for(int i = 0; i < B; i++) {
            map2.put(sc.nextInt(), 1);
        }

        int cnt = 0;
        for(Integer key : map.keySet()) {
            if(map2.get(key) == null) {
                cnt++;
            }
        }

        for(Integer key : map2.keySet()) {
            if(map.get(key) == null) {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
