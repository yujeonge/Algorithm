

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9184_신나는_함수_실행 {
	static int dp[][][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		dp = new int[101][101][101];

		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken()) + 50;
			int b = Integer.parseInt(st.nextToken()) + 50;
			int c = Integer.parseInt(st.nextToken()) + 50;
			if (a == 49 && b == 49 && c == 49)
				break;
		
			sb.append("w(").append(a-50).append(", ").append(b-50).append(", ").append(c-50).append(") = ").append(w(a, b, c)).append('\n');
			
		}
		System.out.println(sb);
	}

	public static int w(int a, int b, int c) {

		if (dp[a][b][c] != 0) {
			return dp[a][b][c];
		}

		if (a <= 50 || b <= 50 || c <= 50) {
			dp[a][b][c] = 1;
			return 1;
		}

		else if (a > 70 || b > 70 || c > 70) {
			dp[a][b][c] = w(70, 70, 70);
			return w(70, 70, 70);
		}

		else if (a < b && b < c) {
			dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			return w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		}

		else {
			dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
			return w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
	}
}
