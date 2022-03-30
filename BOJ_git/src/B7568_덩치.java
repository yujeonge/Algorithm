

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568_덩치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] p = new int[N][2];
		
		// 입력받기
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}

		// 비교할 사람 고르기
		for (int i = 0; i < N; i++) {
			int cnt = 1; // 덩치 큰 사람 수를 저장할 변수
			int max = 0;
			// 비교할 대상 고르기
			for (int j = 0; j < N; j++) {
				if (i != j) {
					if (p[i][0] < p[j][0] && p[i][1] < p[j][1]) {
						cnt++;
					}
				}
				max = Math.max(max, cnt);
				if(j==N-1) {
					sb.append(max).append(' ');
				}
			}

		}
		System.out.println(sb);
	}
}
