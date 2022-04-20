package baekjoon.step3;

import java.io.*;

// 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCnt = Integer.parseInt(reader.readLine());

        int[] arr = new int[caseCnt];

        for(int i = 0; i < arr.length; i++) {
            String line = reader.readLine();
            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            writer.write((a+b)+"\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
