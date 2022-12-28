package BOJ;

import java.util.Scanner;

public class B23803_골뱅이_찍기_ㄴ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();

		for (int i = 0; i < (4 * n); i++) {
			for (int j = 0; j < n; j++) {
				sb.append('@');
			}
			sb.append('\n');
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5 * n; j++) {
				sb.append('@');
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}
