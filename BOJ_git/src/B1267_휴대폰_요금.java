

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1267_휴대폰_요금 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 통화 갯수
		int Y = 0;
		int M = 0;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		for (int i = 0; i < n; i++) {
			int time = Integer.parseInt(st.nextToken());
			Y = Y + ((time / 30) + 1) * 10;
			M = M + ((time / 60) + 1) * 15;
		}

		if (Y < M) {
			sb.append('Y').append(' ').append(Y);
		} else if (Y == M) {
			sb.append('Y').append(' ').append('M').append(' ').append(Y);
		} else {
			sb.append('M').append(' ').append(M);
		}

		System.out.println(sb);
	}

}
