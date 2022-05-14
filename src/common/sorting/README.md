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
        int[] array = {5,3,1,2,4};
        // 수의 범위 1 ~ 5
        int[] countingArr = new int[5];
        // 결과를 담을 배열 result
        int[] result = new int[5];
        
        // counting 배열에 array의 값에 해당하는 index 공간에 수를 세어준다. (counting)
        for(int i = 0; i < countingArr.length; i++) {
            countingArr[array[i]]++;
        }
        
        // counting 배열의 누적합을 구해준다. (index 1부터)
        for(int i = 1; i < countingArr.length; i++) {
            countingArr[i] += countingArr[i - 1];
        }
        
        // result에 세팅 (array 의 뒤부터 수행)
        for(int i = array.length - 1; i >= 0; i--) {
            int value = array[i];
            countingArr[value]--;
            result[countingArr[value]] = value;
        }
        
        // 정렬 결과 확인
        for(int a : result) {
            System.out.println(a);
        }
    }
}
```