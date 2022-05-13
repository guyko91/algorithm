#기본 정렬 (JAVA)

## 1. 선택정렬 (Selection Sort)
* 제자리 정렬 (in-place sorting) 알고리즘 중 하나.
* 시간복잡도 O(N*N)
* 데이터가 적을 때에는 성능이 준수하지만, 100개만 늘어나도 효율성이 떨어진다.
```java
public class Main {
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

```