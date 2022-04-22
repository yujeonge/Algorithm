

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579_계단_오르기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 계단의 갯수
		int[] a = new int[301];
		int[] dp = new int[301];

		// 입력받기
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		//기본값들 설정
		dp[0] = 0;
		dp[1] = a[1];
		dp[2] = dp[1] + a[2];
		dp[3] = Math.max(a[1] + a[3], a[2] + a[3]);

		for (int i = 4; i <= n; i++) {
			dp[i] = a[i] + Math.max(dp[i - 2], a[i - 1] + dp[i - 3]); // 3번 연속 계단을 밟으면 안됨
		}

		System.out.println(dp[n]);

	}

}