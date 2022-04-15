

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1149_RGB거리 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); // 집의 수
		int[][] dp = new int[N + 1][3];

		// 입력받으면서 최솟값 구하기
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r;
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g;
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b;

		}
		
/*		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}*/
		
		System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
	}
}
