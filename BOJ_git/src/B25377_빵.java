package BOJ;

import java.util.Scanner;

public class B25377_빵 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = -1;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a <= b) {
				ans = b;
			}
		}

		System.out.println(ans);
	}
}
