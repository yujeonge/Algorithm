package algo2;

import java.util.Scanner;

public class B2522_별_찍기_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 줄
		for (int i = 1; i < n; i++) {
			// 윗쪽 빈공간
			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print(' ');
			}
			// 윗쪽 별
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();

		}

		for (int i = n; i > 0; i--) {
			// 윗쪽 빈공간
			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print(' ');
			}
			// 윗쪽 별
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();

		}
	}
}
