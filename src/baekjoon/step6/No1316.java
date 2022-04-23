package baekjoon.step6;

// 그룹 단어 체커

import java.util.Scanner;

// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
public class No1316 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int caseCnt = sc.nextInt();

        int groupWordCnt = 0;
        for(int i = 0; i < caseCnt; i++) {
            if(isGroupWord()) groupWordCnt++;
        }

        System.out.println(groupWordCnt);
    }

    public static boolean isGroupWord() {
        boolean[] check = new boolean[26];
        int prev = 0;

        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)


            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {

                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }

                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;	//함수 종료
                }
            }
        }
        return true;
    }
}