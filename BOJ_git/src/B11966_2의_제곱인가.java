package BOJ;

import java.util.Scanner;

public class B11966_2의_제곱인가 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < 31; i++) {
			int num = (int) Math.pow(2, i);
			if (num == n) {
				System.out.println(1);
				return;
			}
		}

		System.out.println(0);
	}
}
