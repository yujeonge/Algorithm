package algo;

import java.util.Scanner;

public class B26209_Intercepting_Information {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			int n = sc.nextInt();
			if (n > 1) { 
				System.out.println('F');
				return;
			}
		}
		System.out.println('S');
	}
}
