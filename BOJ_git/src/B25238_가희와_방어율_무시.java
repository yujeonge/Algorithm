package algo;

import java.util.Scanner;

public class B25238_가희와_방어율_무시 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a - ((a * b) / 100) < 100) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
