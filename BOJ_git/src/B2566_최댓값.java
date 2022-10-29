package algo;

import java.util.Scanner;

public class B2566_ÃÖ´ñ°ª {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int n = 0;
		int m = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int temp = sc.nextInt();
				if (temp >= max) {
					max = temp;
					n = i;
					m = j;
				}
			}
		}
		System.out.println(max + "\n" + n + " " + m);
	}
}
