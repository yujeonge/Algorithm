package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2443_별_찍기_6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		// 줄 수
		for (int i = 0; i < n; i++) {
			// 공백찍기
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			// 별찍기
			for (int j = (2 * i); j < (2 * n) - 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
