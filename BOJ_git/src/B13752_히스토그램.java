package BOJ;

import java.util.Scanner;

public class B13752_히스토그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				sb.append('=');
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}
