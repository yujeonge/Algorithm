package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B17388_와글와글_숭고한 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		int sum = S + K + Y;

		int min = Math.min(S, Math.min(K, Y));

		if (sum >= 100) {
			System.out.println("OK");
		} else {
			if (min == S) {
				System.out.println("Soongsil");
			} else if (min == K) {
				System.out.println("Korea");
			} else {
				System.out.println("Hanyang");
			}
		}

	}

}