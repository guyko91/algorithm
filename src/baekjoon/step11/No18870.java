package baekjoon.step11;

import java.util.*;

// 좌표 압축
public class No18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[cnt];
        int[] arr2 = new int[cnt];
        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);

        int rank = 0;
        for (int j : arr2) {
            if (!resultMap.containsKey(j)) {
                resultMap.put(j, rank);
                rank++;
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int key : arr) {
            builder.append(resultMap.get(key)).append(" ");
        }

        System.out.println(builder);

        sc.close();
    }
}
