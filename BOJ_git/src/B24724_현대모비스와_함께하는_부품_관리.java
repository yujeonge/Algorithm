package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24724_현대모비스와_함께하는_부품_관리 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			sb.append("Material Management ").append(i + 1).append('\n');

			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
			}

			sb.append("Classification ---- End!").append('\n');
		}
		System.out.println(sb
				);
	}
}
