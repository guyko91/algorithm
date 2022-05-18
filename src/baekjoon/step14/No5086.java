package baekjoon.step14;

// 배수와 약수

import java.util.Scanner;

// 입력은 여러 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다.
// 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
// 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
public class No5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) break;

            String result;
            if(a > b) {
                if(a%b == 0) {
                    result = "multiple";
                }else {
                    result = "neither";
                }
            }else {
                if(b%a == 0) {
                    result = "factor";
                }else {
                    result = "neither";
                }
            }

            System.out.println(result);
        }
    }
}