package algo;

import java.util.Scanner;

public class B4299_AFC_¿úºí´ø {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] list = sc.nextLine().split(" ");
		int n = Integer.parseInt(list[0]);
		int m = Integer.parseInt(list[1]);

		if (n - m < 0) {
			System.out.println(-1);
		} else {
			if ((n - m) % 2 == 0) {
				System.out.println((n - m) / 2 + m + " " + (n - m) / 2);
			} else {
				System.out.println(-1);
			}
		}
	}
}
