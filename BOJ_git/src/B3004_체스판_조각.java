package BOJ;

import java.util.Scanner;

public class B3004_체스판_조각 {
	static int addNum = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		if (n % 2 != 1) { // 짝수의 경우
			ans = n / 2;
			ans++;
			ans *= ans;

		} else { // 홀수의 경우

			int row = ((n - 1) / 2) + 1;
			int col = ((n + 1) / 2) + 1;
			ans = row * col;
		}
		System.out.println(ans);

	}
}
