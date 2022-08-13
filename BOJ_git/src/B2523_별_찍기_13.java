package algo2;

import java.util.Scanner;

public class B2523_별_찍기_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 줄 수
		for (int i = 0; i < n; i++) {
			// 상단 별
			for (int j = n; j >= n - i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}

		// 줄 수
		for (int i = n - 2; i >= 0; i--) {
			// 하단 별
			for (int j = n; j >= n - i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
