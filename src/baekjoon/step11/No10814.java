package baekjoon.step11;

import java.util.*;

// 나이순 정렬
public class No10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 내 풀이
//        int N = sc.nextInt();
//        sc.nextLine();
//        LinkedList<String> list = new LinkedList<>();
//
//        for(int i = 0; i < N; i++) {
//            list.add(sc.nextLine());
//        }
//
//        list.sort(Comparator.comparing(s -> s.split(" ")[0]));
//
//        for(String a : list) {
//            System.out.println(a);
//        }

        // 다른 풀이.
        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.next();	// 나이
            arr[i][1] = sc.next();	// 이름
        }


        // 나이순으로 정렬
        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s[0])));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }

        System.out.println(sb);

        sc.close();
    }
}