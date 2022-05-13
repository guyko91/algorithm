package common.sorting;

public class SelectionSort {

    // 선택 정렬
    // 제자리 정렬 (in-place sorting) 알고리즘의 하나.
    // 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘.

    // 시간 복잡도 O(N^2)
    // 매 반복마다 10번, 9번, 8번, ... , 1번 반복하기 때문에 시간 복잡도는 O(N*N)으로,
    // 데이터가 1000개라면 10000000번 반복해야 하기 때문에 다소 비효율적인 정렬 방식.
    // BUT 데이터 양이 적을 때에는 좋은 성능을 냄.

    public static void main(String[] args) {
        int[] data = {66, 10, 1, 99, 5};
        sort(data);

        for (int a : data) {
            System.out.println(a);
        }
    }

    public static void sort(int[] data) {
        int size = data.length;
        // 최소값 항목의 index 값.
        int min;
        int temp;

        for(int i = 0; i < size - 1; i++) {
            min = i;
            for(int j = i + 1; j < size; j++) {
                if(data[min] > data[j]) {
                    min = j;
                }
            }

            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

}
