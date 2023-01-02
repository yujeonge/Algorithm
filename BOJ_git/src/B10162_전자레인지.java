package BOJ;

import java.util.Scanner;

public class B10162_전자레인지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0; // 300s
		int b = 0; // 60s
		int c = 0; // 10s

		int t = sc.nextInt();
		int temp = t;

		if (t < 10) {
			System.out.println(-1);
			return;
		}

		if (t / 300 > 0) {
			a = t / 300;
			temp %= 300;
		}
		if (temp / 60 > 0) {
			b = temp / 60;
			temp %= 60;
		}

		if (temp / 10 > 0) {
			c = temp / 10;
			temp %= 10;
		}

		if (temp != 0) {
			System.out.println(-1);
			return;
		}

		System.out.println(a + " " + b + " " + c);
	}

}
