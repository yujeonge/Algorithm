package BOJ;

import java.util.Scanner;

public class B27110_특식_배부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			if (n - a > 0) {
				ans += a;
			} else {
				ans += n;
			}
		}

		System.out.println(ans);
	}
}
