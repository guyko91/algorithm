package common.sorting;

import java.util.Arrays;

public class ShellSort {
    // 갭을 담고있는 배열
    public final static int[] gap = {
        1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
        8858, 19930, 44842, 100894, 227011, 510774,
        1149241, 2585792, 5818032, 13090572, 29453787,
        66271020, 149109795, 335497038, 754868335, 1698453753
    };

    public static void main(String[] args) {
        int[] arr = new int[]{3,6,41,2,4,1,5,743};
        sort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int size) {
        int index = getGap(size);	// 첫 gap을 사용할 index

        // gap[index] 값부터 gap[0] 까지 반복한다.
        for (int i = index; i >= 0; i--) {
            for (int j = 0; j < gap[i]; j++) {	// 각 부분 리스트에 대해 삽입정렬을 한다.
                insertion_sort(arr, j, size, gap[i]);
            }
        }

    }

    // 맨 처음 gap을 참조 할 인덱스를 구하는 메소드
    private static int getGap(int length) {
        int index = 0;
        // 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
        int len = (int)(length / 2.25);
        while (gap[index] < len) {
            index++;
        }
        return index;
    }

    public static void insertion_sort(int[] arr, int start, int size, int gap) {
        // 부분 배열의 두 번째 원소부터 size까지 반복한다. (gap 값씩 건너띔)
        for (int i = start + gap; i < size; i += gap) {

            int target = arr[i];
            int j = i - gap;

            // 타겟 원소가 이전의 원소보다 작을 때 까지 반복
            while (j >= start && target < arr[j]) {
                arr[j + gap] = arr[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
                j -= gap;
            }
            /*
             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + gap 에 위치하게 된다.
             */
            arr[j + gap] = target;
        }
    }
}
