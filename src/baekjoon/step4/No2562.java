package baekjoon.step4;

import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        for(int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();


        int tmp = array[0];
        int tmpIdx = 0;
        for(int i = 1; i < array.length; i++) {
            if(tmp < array[i]) {
                tmp = array[i];
                tmpIdx = i;
            }
        }

        System.out.println(tmp);
        System.out.println((tmpIdx + 1));
    }
}
