

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9550_아이들은_사탕을_좋아해 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 슽택이가 가지고 있는 사탕의 종류
			int K = Integer.parseInt(st.nextToken()); // 아이들이 먹어야하는 사탕의 수
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int candy = Integer.parseInt(st.nextToken());
				cnt += candy / K;
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
		br.close();
	}	
}
