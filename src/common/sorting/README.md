#기본 정렬 (JAVA)

## 정렬의 특징
* 비교 정렬 : 데이터를 '비교'하면서 찾는 방식
  * 선택 정렬, 삽입 정렬
* 제자리 정렬 : 정렬의 대상 외에 추가적인 공간이 필요 없는 방식
  * 선택 정렬, 삽입 정렬
* 안정 정렬 : 정렬 규칙
  * 삽입 정렬
* 불안정 정렬 : 정렬 규칙이 다수이거나 특정 순서를 유지해야할 때 문제가 될 수 있는 방식

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
            System.out.print(a);
        }
        
        // result : 1 5 10 99 66 
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

## 2. 계수정렬 (Counting Sort)
* 데이터의 값이 몇번 나왔는지를 세주는 방식.
* 주어진 배열의 값 범위가 작은 경우 빠른 속도를 갖는 정렬 알고리즘.
* 시간 복잡도 O(n + k) (k = 배열의 최대값)
* 입력값의 범위가 작을 때 높은 효율을 보인다.
```java
public class Main {
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
```
## 3. 버블 정렬 (BubbleSort)
* 바로 옆 값과 비교해서 더 작은 값을 앞으로 옮기는 방법.
* "가장 비효율적"인 정렬 방식. (전체를 다 비교해야 함.)
* 시간 복잡도 O(N^2)

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 41, 2, 4, 1, 5, 743};
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
```
## 4. 삽입 정렬 (InsertionSort)
* 비교 대상 target과 이전 원손들을 비교하여 target이 작으면 자리를 교환 하는 방식.
* 비교정렬 / 제자리 정렬 / 안정 정렬
* 특징
  * 거의 정렬된 배열을 정렬하는 경우 효율적 (최선의 경우 O(N)의 시간 복잡도)
  * 역순에 가까울 수록 매우 비효율적 (최악의 경우 O(N^2)의 시간 복잡도)
  * 데이터의 상태에 따라서 편차가 매우 크다.
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, 6, 41, 2, 4, 1, 5, 743};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            // 비교대상 타겟
            int target = array[i];
            
            int j = i - 1;
            while (j >= 0 && target < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            
            arr[j + 1] = target;
        }
    }
}
```