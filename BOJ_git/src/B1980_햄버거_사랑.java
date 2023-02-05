package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1980_햄버거_사랑 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int ham = 0;
		int coke = 0;
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		ham = t / n;
		coke = t % n;
		for (int i = 1; i <= t / m; i++) {
			int temp = (t - m * i) % n;
			if (coke > temp) {
				coke = temp;
				ham = i + (t - m * i) / n;
			}
		}
		System.out.println(ham + " " + coke);
	}

}
