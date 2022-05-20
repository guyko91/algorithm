package baekjoon.step19;

import java.util.Scanner;

// 스택
// push X: 정수 X를 스택에 넣는 연산이다.
// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 스택에 들어있는 정수의 개수를 출력한다.
// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
public class No10828 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        int cnt = sc.nextInt();
        sc.nextLine();

        stack = new int[cnt];

        for(int i = 0; i < cnt; i++) {
            String input = sc.next();

            switch (input) {
                case "push" :
                    push(sc.nextInt());
                    break;
                case "pop":
                    builder.append(pop()).append('\n');
                    break;
                case "size":
                    builder.append(size()).append('\n');
                    break;

                case "empty":
                    builder.append(empty()).append('\n');
                    break;

                case "top":
                    builder.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(builder);
        sc.close();
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int top() {
        if(size == 0) {
            return -1;
        }else {
            return stack[size - 1];
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        }else {
            return 0;
        }
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }
}
