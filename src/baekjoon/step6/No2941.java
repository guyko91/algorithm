package baekjoon.step6;

import java.util.Scanner;

// 크로아티아 알파벳
// 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
// dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
// 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
// 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
public class No2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        int wordCnt = 0;

        for(int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if(ch == 'c') {
                if(i < input.length() - 1) {
                    if(input.charAt(i+1) == '=') {
                        i++;
                    }else if(input.charAt(i+1) == '-') {
                        i++;
                    }
                }
            }else if(ch == 'd') {
                if(i < input.length() - 1) {
                    if (input.charAt(i + 1) == 'z') {
                        if(i < input.length() - 2) {
                            if (input.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (input.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }else if(ch == 'l') {
                if(i < input.length() - 1) {
                    if (input.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if(ch == 'n') {
                if(i < input.length() - 1) {
                    if (input.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }else if(ch == 's') {
                if(i < input.length() - 1) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }else if(ch == 'z') {
                if(i < input.length() - 1) {
                    if (input.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            wordCnt++;
        }

        System.out.println(wordCnt);

    }
}
