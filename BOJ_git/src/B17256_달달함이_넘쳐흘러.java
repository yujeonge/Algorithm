package algo;

import java.util.Scanner;

public class B17256_달달함이_넘쳐흘러 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}

		int[] c = new int[3];
		for (int i = 0; i < 3; i++) {
			c[i] = sc.nextInt();
		}

		int bx = c[0] - a[2];
		int bz = c[1] / a[1];
		int by = c[2] - a[0];

		System.out.print(bx + " " + bz + " " + by);

	}

}
