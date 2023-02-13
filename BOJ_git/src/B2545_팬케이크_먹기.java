package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2545_팬케이크_먹기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");

			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			long d = Long.parseLong(st.nextToken());

			if (d == 0) {
				sb.append(a * b * c).append('\n');
				continue;
			}

			// max, min, mid구하기
			long max = Math.max(a, Math.max(b, c));
			long min = Math.min(a, Math.min(b, c));
			long mid = 0;
			if (max == a) {
				mid = Math.max(b, c);
			} else if (max == b) {
				mid = Math.max(a, c);
			} else {
				mid = Math.max(a, b);
			}

			// 팬케익 자르기
			for (long j = d; j >= 0; j--) {
				long temp = max - mid;

//				System.out.println(max + "-" + mid + " = " + temp);
				if (temp == 0) {
					// System.out.println("temp는 0");
					if (max == a) {
						a--;
					} else if (max == b) {
						b--;
					} else {
						c--;
					}
				} else if (temp <= j) {
					// System.out.println("temp는 j보다 작다");
					if (max == a) {
						a -= temp;
					} else if (max == b) {
						b -= temp;
					} else {
						c -= temp;
					}
					j -= temp;
				} else if (temp > j) {
					// System.out.println("temp는 j보다 큼");
					if (max == a) {
						a -= (j + 1);
					} else if (max == b) {
						b -= (j + 1);
					} else {
						c -= (j + 1);
					}
					j = 0;
				}

				max = Math.max(a, Math.max(b, c));
				min = Math.min(a, Math.min(b, c));

				if (max == a) {
					mid = Math.max(b, c);
				} else if (max == b) {
					mid = Math.max(a, c);
				} else {
					mid = Math.max(a, b);
				}

			}

			sb.append(a * b * c).append('\n');
		}
		System.out.println(sb);
	}
}
