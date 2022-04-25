package baekjoon.step7;

import java.util.Scanner;

// 손익 분기점
public class No1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // 고정비용
        long fixed = Long.parseLong(input.split(" ")[0]);
        // 부가비용
        long add = Long.parseLong(input.split(" ")[1]);
        // 컴퓨터 판매 가격
        long price = Long.parseLong(input.split(" ")[2]);

        if(price <= add) {
            System.out.println("-1");
        }else {
            System.out.println((fixed/(price-add))+1);
        }
    }
}
