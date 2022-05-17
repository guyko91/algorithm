package common.sorting;

// 버블 정렬

import java.util.Arrays;

// 배열을 순차 탐색하여 i + 1번째 요소를 비교하여 큰 것을 뒤로 이동.
// 성능 : 평균 O(n^2) / 최선 (n-1) / 최악 (n * (n-1)/2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,41,2,4,1,5,743};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
