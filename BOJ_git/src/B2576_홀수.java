package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2576_홀수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			n = Integer.parseInt(br.readLine());
			if (n % 2 != 0) {
				min = Math.min(min, n);
				sum += n;
			}
		}

		if (sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
}
