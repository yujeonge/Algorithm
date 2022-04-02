

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14501_퇴사 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] T = new int[N + 10]; // 상담 완료하는데 걸리는 기간
		int[] P = new int[N + 10]; // 받을 수 있는 금액
		int[] dp = new int[N + 10]; // 최대 수입 저장, dp[n+1]에는 최종으로 받는 금액이 저장됨
		int max = 0;

		// 입력받기
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N + 1; i++) {// 마지막날+1일 경우까지 구해야 함
			// i일 이전까지의 최댓값과 자기자신 중 큰 값
			dp[i] = Math.max(max, dp[i]);

			// i일에 상담했을 때, 받을 수 있는 돈은 i+T[i]인 상담이 다 끝난 후에 받음, 이때를 계산
			dp[T[i] + i] = Math.max(dp[T[i] + i], P[i] + dp[i]);

			// i까지 일 했을 때 최댓값 구하는 부분. 이제 i+1로 넘어가기전, 최댓값을 담아주고 다음 루프에서 이전까지의 최댓값으로서 쓰인다.
			max = Math.max(max, dp[i]);

		}
		System.out.println(max);
	}
}
