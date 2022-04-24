

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*11452KB	72ms*/
public class B1003_피보나치_함수 {
	static int[][] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine()); // 테케횟수
		dp = new int[41][2]; // n은 40보다 작거나 같은 자연수 또는 0

		// 초기값 채워주기
		dp[0][0] = 1;
		dp[1][1] = 1;

		// 테케만큼 반복
		for (int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine()); 
			fibo(n);
			sb.append(dp[n][0]).append(' ').append(dp[n][1]).append('\n');
		}
		
		System.out.println(sb);
	}

	public static int[] fibo(int num) {
		if (num > 1) { //num이 1보다 크다면 (0~1은 초기값으로 채웠음)
			if (dp[num][0] == 0 || dp[num][1] == 0) { //dp를 구했다면 0이나 1중 하나는 0이 아닐것임
				dp[num][0] = fibo(num - 1)[0] + fibo(num - 2)[0]; 
				dp[num][1] = fibo(num - 1)[1] + fibo(num - 2)[1];
			}
		}
		return dp[num];
	}

}
