package baekjoon.step7;

// 설탕 배달
// 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
// 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
// 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.

import java.io.*;

// 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
// TODO https://st-lab.tistory.com/72
public class No2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(r.readLine());

        if ( input == 4 || input == 7 ) {
            w.write("-1\n");
            w.flush();
            w.close();
            r.close();
            return;
        }

        // 최소한으로 들고가는게 목적이기 때문에, 5로 나눈 값을 기준으로 본다.
        int fiveCnt = input/5;

        if(fiveCnt == 0) {
            // only 3kg
            w.write((input/3) + "\n");
        }else {
            int remain = (input-(5*fiveCnt));

            while(remain % 3 != 0) {
                fiveCnt--;
                remain = (input-(5*fiveCnt));
            }

            w.write((fiveCnt + (remain/3)) + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
