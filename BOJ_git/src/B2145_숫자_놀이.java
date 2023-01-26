package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2145_숫자_놀이 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			} else {
				if (n < 10) {
					sb.append(n).append('\n');
				} else {
					sb.append(sol(n)).append('\n');
				}
			}
		}
		System.out.println(sb);
	}

	public static int sol(int n) {
		int ans = 0;
		int temp = 0;

		while (true) {
			// 종료조건
			if (n < 10) {
				temp += n;
				if (temp >= 10) {
					ans += temp % 10;
					ans += temp / 10;
				} else {
					ans += temp;

				}
				if (ans >= 10) {
					temp = ans;
					ans = temp / 10;
					ans += temp % 10;
				}
				return ans;
			} else {
				temp += (n % 10);
				n /= 10;
			}
		}

	}
}
