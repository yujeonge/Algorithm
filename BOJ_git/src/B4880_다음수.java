package BOJ;

import java.util.Scanner;

public class B4880_다음수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			// 종료조건
			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			int ap = b - a;
			int gp = 0;
			if (a != 0) {
				gp = b / a;
			}
			if (c - b == ap) {
				sb.append("AP ").append(c + ap).append('\n');
			} else if (c / b == gp) {
				sb.append("GP ").append(c * gp).append('\n');
			}
		}
		System.out.println(sb);
	}
}
