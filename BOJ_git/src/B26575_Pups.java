package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B26575_Pups {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			double d = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double p = Double.parseDouble(st.nextToken());

			double num = d * f * p;

			String str = String.format("%.2f", num);
			
			sb.append('$').append(str).append('\n');
		}
		System.out.println(sb);
	}
}
