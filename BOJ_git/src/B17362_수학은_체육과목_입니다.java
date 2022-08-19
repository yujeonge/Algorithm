package algo2;

import java.util.Scanner;

public class B17362_수학은_체육과목_입니다 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 1;
		int change = -1;

		for (int i = 1; i < n; i++) {
			if (cnt <= 1) {
				change *= -1;
			}

			cnt += change;

			if (cnt >= 5) {
				change *= -1;
			}
		}

		System.out.println(cnt);
	}
}
