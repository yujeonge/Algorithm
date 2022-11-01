package algo;

import java.util.Scanner;

public class B6810_ISBN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = (9 * 1) + (7 * 3) + (8 * 1) + (0 * 3) + (9 * 1) + (2 * 3) + (1 * 1) + (4 * 3) + (1 * 1) + (8 * 3)
				+ (sc.nextInt() * 1) + (sc.nextInt() * 3) + (sc.nextInt() * 1);
		System.out.println("The 1-3-sum is "+ans);

	}
}
