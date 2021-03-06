#기본 정렬 (JAVA)

## 정렬의 특징
* 비교 정렬 : 데이터를 '비교'하면서 찾는 방식
  * 선택 정렬, 삽입 정렬
* 제자리 정렬 : 정렬의 대상 외에 추가적인 공간이 필요 없는 방식
  * 선택 정렬, 삽입 정렬
* 안정 정렬 : 중복된 값을 입력 순서와 동일하게 정렬하는 정렬 알고리즘.
  * 삽입 정렬, 병합정렬, 버블정렬
* 불안정 정렬 : 중복된 값이 입력 순서와 동일하지 않게 정렬되는 알고리즘.
  * 퀵 정렬, 선택 정렬, 계수 정렬

## 1. 선택정렬 (Selection Sort)
* 제자리 정렬 (in-place sorting) 알고리즘 중 하나.
* 시간복잡도 
  * BEST : n^2
  * AVG : n^2
  * WORST : n^2
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
* 시간 복잡도 (정수의 최댓 값에 따라 무한대가 될 수도 있다.)
  * O(n + k)
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
* 시간 복잡도
  * BEST : n^2
  * AVG : n^2
  * WORST : n^2
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
* 비교 대상 target과 이전 원소들을 비교하여 target이 작으면 자리를 교환 하는 방식.
* 시간 복잡도
  * BEST : n
  * AVG : n^2
  * WORST : n^2
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
## 5. 합병 정렬 (MergeSort)
* 하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정한 다음, 두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 방식.
* 분할(Divide) -> 정복(Conquer) -> 결합(Combine) 순으로 이루어진다.
* 시간 복잡도
  * BEST : nlog2n
  * AVG : nlog2n
  * WORST : nlog2n

```java
import java.util.Arrays;

public class Main {
  public static int[] src;
  public static int[] tmp;

  public static void main(String[] args) {
    src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
    tmp = new int[src.length];
    
    sort(0, src.length - 1);
  }

  public static void sort(int start, int end) {
      if (start < end) {
          // 중간값 
          int mid = (start + end) / 2;
          sort(start, mid);
          sort(mid + 1, end);
          
          int p = start;
          int q = mid + 1;
          int idx = p;
          
          while (p <= mid || q <= end) {
              if (q > end || (p <= mid && src[p] < src[q])) {
                  tmp[idx++] = src[p++];
              }else {
                  tmp[idx++] = src[q++];
              }
          }
          
          for(int i = start; i <= end; i++) {
            src[i] = tmp[i];       
          }
      }
  };
}
```
## 6. 셸 정렬 (ShellSort)
* 'Donald L. Shell'이 제안한 방법으로, 삽입정렬을 보완한 알고리즘.
* 과정
  1) 정렬해야 할 리스트를 일정한 기준에 따라 분류
  2) 연속적이지 않은 여러 개의 부분 리스트를 생성
  3) 각 부분 리스트를 삽입 정렬을 이용하여 정렬
  4) 모든 부분 리스트가 정렬되면 다시 전체 리스트를 더 작은 개수의 부분 리스트로 만든 후 알고리즘을 반복
  5) 위의 과정을 부분 리스트의 개수가 1이 될 때 가지 반복
* 시간 복잡도
  * BEST : n
  * AVG : n^1.5
  * WORST : n^2
```java
import java.util.Arrays;

public class Main {
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
```