

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9095_123_더하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[11]; // n은 11보다 작은 양수
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		//dp채워넣기
		for (int i = 4; i <= 10; i++) {
			if(dp[i]==0) {
				for (int j = 1; j <= 3; j++) {
					dp[i] += dp[i - j];
				}
			}
		}
		
		// 테케 돌리기
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append('\n');
		}
		System.out.println(sb);
	}
}
