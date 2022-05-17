package baekjoon.step13;

// 택시 기하학

import java.util.Scanner;
// 19세기 독일 수학자 헤르만 민코프스키는 비유클리드 기하학 중 택시 기하학을 고안했다.
// 택시 기하학에서 두 점 T1(x1,y1), T2(x2,y2) 사이의 거리는 다음과 같이 구할 수 있다.
// D(T1,T2) = |x1-x2| + |y1-y2|
// 두 점 사이의 거리를 제외한 나머지 정의는 유클리드 기하학에서의 정의와 같다.
// 따라서 택시 기하학에서 원의 정의는 유클리드 기하학에서 원의 정의와 같다.
// 원: 평면 상의 어떤 점에서 거리가 일정한 점들의 집합
// 반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
public class No3053 {
    public static final double PI = 3.14159265359;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 반지름
        int r = sc.nextInt();

        // 유클리드 기하학의 원의 넓이 (반지름 * 반지름 * 3.141592)
        System.out.println(String.format("%.6f", PI * r * r));

        // 택시 기하학의 원의 넓이 2*반지름^2
        System.out.println(String.format("%.6f", (double)2*(r*r)));

        sc.close();
    }
}
