package baekjoon.step4;

import java.io.*;

// 평균은 넘겠지
// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
// 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
public class No4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        // 케이스 수
        int cnt = Integer.parseInt(r.readLine());
        String caseArr[] = new String[cnt];

        for(int i = 0; i < caseArr.length; i++) {
            caseArr[i] = r.readLine();
        }


        // 각 케이스
        for(String line : caseArr) {
            String[] lineArr = line.split(" ");

            // 케이스 수
            int caseCnt = Integer.parseInt(lineArr[0]);
            int sum = 0;
            for(int i = 1; i < lineArr.length; i++) {
                sum += Integer.parseInt(lineArr[i]);
            }

            float avg = (float) (sum/caseCnt);

            int overallCnt = 0;
            for(int i = 1; i < lineArr.length; i++) {
                if (Integer.parseInt(lineArr[i]) > avg) overallCnt++;
            }

            w.write( String.format("%.3f", (((float)overallCnt/caseCnt) * 100)) + "%\n");
        }

        w.flush();
        r.close();
        w.close();
    }
}
