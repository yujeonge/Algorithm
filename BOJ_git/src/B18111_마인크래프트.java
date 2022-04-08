

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18111_마인크래프트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		int min = Integer.MAX_VALUE;
		int max = 0;

		// 입력받기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				min = Math.min(min, map[i][j]); // 최소값 구하기
				max = Math.max(max, map[i][j]); // 최댓값 구하기
			}
		}

		int time = Integer.MAX_VALUE;
		int ground = -1;

		// 층 마다 걸리는 시간계산하기
		for (int f = min; f <= max; f++) {
			int timeTemp = 0; // 각 높이를 만들때마다 걸리는 시간
			int BTemp = B; // 인벤토리에 있는 블록갯수

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					int a = map[i][j] - f;

					if (a > 0) { // 블록제거
						timeTemp += Math.abs(a) * 2;
						BTemp += Math.abs(a);
					} else if (a < 0) { // 블록놓기
						timeTemp += Math.abs(a);
						BTemp -= Math.abs(a);
					}

				}
			}
			if (BTemp < 0) // 만들수 없음
				continue;
			else {
				time = Math.min(time, timeTemp);
				if (time == timeTemp) {
					ground = f;
				}
			}
		}

		System.out.println(time + " " + ground);
	}
}