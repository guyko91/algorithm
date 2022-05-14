package common.sorting;

// 게수 정렬 (Counting Sort)
public class CountingSort {
    public static void main(String[] args) {

        // 수열의 원소는 50개
        int[] arr = new int[50];
        // 수의 범위는 0 ~ 50
        int[] countingArr = new int[51];
        // 정렬 결과를 담을 배열.
        int[] result = new int[50];

        // arr에 0 ~ 50 사이의 수를 랜덤하게 세팅.
        for(int i = 0; i < 50; i++) {
            arr[i] = (int)(Math.random()*50);
        }

        // 정렬 시작.
        for(int i = 0; i < arr.length; i++) {
            // arr의 값을 index로 하는 counting 배열에 값을 증가 시켜준다.
            countingArr[arr[i]]++;
        }

        // counting 배열에 누적 합 해주기. (index 1 부터)
        for(int i = 1; i < countingArr.length; i++) {
            countingArr[i] += countingArr[i - 1];
        }

        // 결과 배열에 세팅. (맨 뒤부터 수행)
        for(int i = arr.length - 1; i >= 0; i--) {
            // i 번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
            // counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
            int value = arr[i];
            countingArr[value]--;
            result[countingArr[value]] = value;
        }

        for(int a : result) {
            System.out.println(a);
        }

    }
}
