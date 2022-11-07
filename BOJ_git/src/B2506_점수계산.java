package algo;

import java.util.Scanner;

public class B2506_점수계산 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() == 1) {
				cnt++;
			} else {
				cnt = 0;
			}
			ans += cnt;
		}
		System.out.println(ans);
	}
}
