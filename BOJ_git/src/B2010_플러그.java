package algo;

import java.util.Scanner;

public class B2010_ÇÃ·¯±× {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < cnt; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum - (cnt - 1));
	}
}