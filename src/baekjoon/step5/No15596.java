package baekjoon.step5;

// 정수 N개의 합
public class No15596 {
    public static long sum(int[] a) {
        long sum = 0;
        for(int n : a) sum += n;
        return sum;
    }
}
