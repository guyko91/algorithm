package baekjoon.step10;

// 영화감독 숌
// 종말의 숫자란 어떤 수에 6이 적어도 3개이상 연속으로 들어가는 수를 말한다. 제일 작은 종말의 숫자는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 과 같다.
// 따라서, 숌은 첫 번째 영화의 제목은 세상의 종말 666, 두 번째 영화의 제목은 세상의 종말 1666 이렇게 이름을 지을 것이다. 일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 숫자) 와 같다.
// 숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성하시오. 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.

import java.util.Scanner;

// 첫째 줄에 숫자 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.
// 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.
public class No1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int number = 0;
        while(cnt != 0) {
            number++;
            if(isContains(number)) {
                cnt--;
            }
        }

        System.out.println(number);
        sc.close();
    }

    public static boolean isContains(int number) {
        String str = String.valueOf(number);
        return str.contains("666");
    }
}
