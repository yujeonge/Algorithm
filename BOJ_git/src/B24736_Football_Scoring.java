package algo;

import java.util.Scanner;

public class B24736_Football_Scoring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			int t = sc.nextInt();
			int f = sc.nextInt();
			int s = sc.nextInt();
			int p = sc.nextInt();
			int c = sc.nextInt();

			int ans = (6 * t) + (3 * f) + (2 * s) + (p) + (2 * c);
			sb.append(ans).append(' ');
		}
		System.out.println(sb);
	}
}
