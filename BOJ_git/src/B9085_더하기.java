package BOJ;

import java.util.Scanner;

public class B9085_더하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			int ans = 0;
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				ans += sc.nextInt();
			}
			sb.append(ans).append('\n');
		}
		
		System.out.println(sb);
	}
}
