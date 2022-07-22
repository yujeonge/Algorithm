package algo2;

import java.util.Scanner;

public class B2442_별_찍기_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		// 줄
		for (int i = 0; i < n; i++) {
			// 공백출력
			for (int j = n - i; j > 1; j--) {
				sb.append(' ');

			}
			// * 출력
			for (int j = 0; j < (2 * i) + 1; j++) {
				sb.append('*');

			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
