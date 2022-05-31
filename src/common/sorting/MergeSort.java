package common.sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] src;
    public static int[] tmp;

    public static void main(String[] args) {
        src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        tmp = new int[src.length];

        System.out.println(Arrays.toString(src));
        sort(0, src.length - 1);
        System.out.println(Arrays.toString(src));
    }

    // start : merge sort를 진행할 배열의 시작 인덱스.
    // end : 마지막으로 포함될 배열의 인덱스.
    public static void sort(int start, int end) {
        if (start < end) {
            // 중간값
            int mid = (start + end) / 2;
            sort(start, mid);
            sort(mid + 1, end);

            int p = start;
            int q = mid + 1;
            int idx = p;

            while (p <= mid || q <= end) {
                if (q > end || (p <= mid && src[p] < src[q])) {
                    tmp[idx++] = src[p++];
                }else {
                    tmp[idx++] = src[q++];
                }
            }

            for(int i = start; i <= end; i++) {
                src[i] = tmp[i];
            }
        }
    };

}
