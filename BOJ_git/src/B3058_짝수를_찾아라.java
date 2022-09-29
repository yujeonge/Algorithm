package algo;

import java.util.Scanner;

public class B3058_짝수를_찾아라 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int sum = 0;
			int min = Integer.MAX_VALUE;

			for (int j = 0; j < 7; j++) {
				int n = sc.nextInt();
				if (n % 2 == 0) {
					sum += n;
					min = Math.min(min, n);
				}
			}
			System.out.println(sum + " " + min);
		}
	}
}
