package common.sorting;

import java.util.Arrays;

// 삽입 정렬
// 비교정렬 * 제자리 정렬 * 안정 정렬
// 순서1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교. (첫 번째 타겟은 두번째 원소부터 시작)
// 순서2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
// 순서3. 그 다음 타겟을 찾아 위와 같은 방법을 반복.
// 앞 원소와 비교하면서 작으면 앞으로 댕기는 방식.
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,6,41,2,4,1,5,743};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j = i - 1;
            while(j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }
    }
}
