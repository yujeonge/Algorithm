package BOJ;

import java.util.Scanner;

public class B16486_운동장_한_바퀴 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt(); // 직사각형 가로길이
		int d2 = sc.nextInt(); // 반지름 길이

		double ans = (2 * d2 * 3.141592) + 2 * d1;
		System.out.println(ans);
	}
}
