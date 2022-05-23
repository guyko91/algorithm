package baekjoon.step12;

// 듣보잡

import java.util.*;

// 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
// 이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
// 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
public class No1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map1 = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            String str = sc.nextLine();
            map1.put(str, 1);
        }

        for(int i = 0; i < M; i++) {
            String str = sc.nextLine();
            if(map1.get(str) != null) {
                list.add(str);
            }
        }

        list.sort(Comparator.comparing(s -> s));

        System.out.println(list.size());
        for(String a : list) {
            System.out.println(a);
        }
    }
}
