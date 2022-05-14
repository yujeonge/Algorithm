

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B12865_평범한_배낭 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 물품의 수
		int K = Integer.parseInt(st.nextToken()); // 준서가 버틸 수 있는 무게
		int[][] items = new int[N + 1][2]; // 물건이 없는 경우도 고려
		int[][] dp = new int[N + 1][K + 1];
		// 물건의 무게, 가치 입력받기
		for (int i = 1; i < N + 1; i++) {
			st = new StringTokenizer(br.readLine());
			items[i][0] = Integer.parseInt(st.nextToken()); // W, 물건의 무게 입력받기
			items[i][1] = Integer.parseInt(st.nextToken()); // V, 물건의 가치 입력받기
		}

		// 물건 1번부터~N번까지
		for (int i = 1; i < N + 1; i++) {
			// 무게 1kg~Kkg까지
			for (int j = 1; j <= K; j++) {

				// 물건을 담을 수 없으면
				if (items[i][0] > j) {
					// i - 1번째 물건까지 고려했을때 무게 j에서의 최대 가치(최적해)를 그대로 가져온다.
					dp[i][j] = dp[i - 1][j];
				} else {// 물건을 담을 수 있으면
					// i - 1번째 물건까지 고려했을때 무게 j에서의 최대 가치(최적해)와,
					// i - 1번째 물건까지 고려했을때 무게 j - items[i][0](현재 무게)의 최대 가치(최적해) + items[i][1](현재 가치)
					// 중에서 큰 값을 선택
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - items[i][0]] + items[i][1]);
				}
			}
		}

		System.out.println(dp[N][K]);
	}
}
