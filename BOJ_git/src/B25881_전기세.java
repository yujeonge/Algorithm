package BOJ;

import java.util.Scanner;

public class B25881_전기세 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int basic = sc.nextInt();
		int over = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int used = sc.nextInt();
			int ans = 0;
			if (used > 1000) {
				ans = (used - 1000) * over + (1000 * basic);
			} else {
				ans = used * basic;
			}
			sb.append(used).append(' ').append(ans).append('\n');
		}
		System.out.println(sb);
	}
}
