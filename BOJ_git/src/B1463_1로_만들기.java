

import java.util.Scanner;

public class B1463_1로_만들기 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[N + 1]; 
		dp[1] = 0; //초기값은 1부터 N까지의 연산을 진행할 것이기 때문에 아래와 같이 설정

		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
		}
		System.out.print(dp[N]);
	}
}