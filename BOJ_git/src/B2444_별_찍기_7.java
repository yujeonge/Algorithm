package algo2;

import java.util.Scanner;

public class B2444_별_찍기_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		// 상단 삼각형
		for (int i = 0; i < n; i++) {
			// 공백
			for (int j = n - i - 1; j > 0; j--) {
				sb.append(' ');
			}
			// 상단 삼각형
			for (int j = 0; j < (2 * i) + 1; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}

		// 하단 삼각형
		for (int i = n - 2; i >= 0; i--) {
			// 공백
			for (int j = n - i - 1; j > 0; j--) {
				sb.append(' ');
			}
			// 상단 삼각형
			for (int j = 0; j < (2 * i) + 1; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
