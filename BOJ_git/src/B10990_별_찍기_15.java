package algo;

import java.util.Scanner;

public class B10990_별_찍기_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		// 줄수
		for (int i = 0; i < n; i++) {
			// 윗쪽 공백
			for (int j = n - 1; j > i; j--) {
				sb.append(' ');
			}
			sb.append('*');
			// 사이 공백
			for (int j = 0; j < i * 2 - 1; j++) {
				sb.append(' ');
			}
			if (i > 0) {
				sb.append('*');
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}
