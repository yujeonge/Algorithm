package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2446_별_찍기_9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		// 줄
		for (int i = 0; i < n; i++) {
			// 위쪽 좌측 공백
			for (int j = 0; j < i; j++) {
				sb.append(' ');
			}
			// 상단 별
			for (int j = 2 * (n - i) - 1; j > 0; j--) {
				sb.append('*');
			}
			sb.append('\n');
		}
		// 줄
		for (int i = n - 2; i >= 0; i--) {
			// 아랫쪽 좌측 공백
			for (int j = 0; j < i; j++) {
				sb.append(' ');
			}
			// 하단 별
			for (int j = 2 * (n - i) - 1; j > 0; j--) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
