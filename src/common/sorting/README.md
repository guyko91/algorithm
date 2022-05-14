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