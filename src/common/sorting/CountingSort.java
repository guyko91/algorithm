package common.sorting;

// 계수 정렬 (카운팅 정렬)
public class CountingSort {
    public static void main(String[] args) {

        // 0 ~ 30 의 임의의 값을 담을 배열
        int[] arr = new int[100];
        // 수의 범위 0 ~ 30
        int[] counting = new int[31];
        int[] result = new int[100];

        // arr 에 랜덤 수 100개를 채움.
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*31);
        }

        // STEP1. arr의 value 값을 index로 하는 counting 배열의 값을 1 증가.
        for (int i : arr) {
            counting[i]++;
        }

        // STEP2. counting 배열의 각 값을 누적합으로 변경
        for(int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        // STEP3
        // 뒤부터 역순으로 진행.
        for(int i = arr.length - 1; i >= 0; i--) {
            /*
             *  i 번쨰 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
             *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
             */
            int value = arr[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        for(int a : result) {
            System.out.println(a);
        }

    }
}
