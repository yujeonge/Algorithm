package algo;

import java.util.Scanner;

public class B2720_ºº≈πº“_ªÁ¿Â_µø«ı {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			sb.append(n / 25).append(' ');
			n %= 25;
			sb.append(n / 10).append(' ');
			n %= 10;
			sb.append(n / 05).append(' ');
			n %= 5;
			sb.append(n / 01).append('\n');
			n %= 1;

		}

		System.out.println(sb);
	}
}
