package algo2;

import java.util.Scanner;

public class B2445_별_찍기_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		// 줄
		for (int i = 0; i < n - 1; i++) {
			// 상단 좌측 별찍기
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			// 중간 공백
			for (int j = (2 * (n - i - 1)); j > 0; j--) {
				sb.append(' ');
			}
			// 상단 우측 별찍기
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		// 중간 줄
		for (int j = 0; j < 2 * n; j++) {
			sb.append('*');
		}
		sb.append('\n');
		// 줄 수
		for (int i = n - 2; i >= 0; i--) {
			// 하단 좌측 별찍기
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			// 중간 공백
			for (int j = (2 * (n - i - 1)); j > 0; j--) {
				sb.append(' ');
			}
			// 하단 우측 별찍기
			for (int j = 0; j < i + 1; j++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
