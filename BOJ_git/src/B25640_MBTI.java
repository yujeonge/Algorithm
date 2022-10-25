package algo;

import java.util.Scanner;

public class B25640_MBTI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (str.equals(sc.next())) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
