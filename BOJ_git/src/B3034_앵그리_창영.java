package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3034_¾Þ±×¸®_Ã¢¿µ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			int stick = Integer.parseInt(br.readLine());
			if (stick <= Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2))) {
				sb.append("DA").append('\n');
			} else {
				sb.append("NE").append('\n');
			}
		}

		System.out.println(sb);
	}
}
