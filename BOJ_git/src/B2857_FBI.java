package BOJ;

import java.util.Scanner;

public class B2857_FBI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		boolean isZero = true;

		for (int i = 1; i < 6; i++) {
			String str = sc.nextLine();
			if (str.contains("FBI")) {
				isZero = false;
				sb.append(i).append(' ');
			}
		}

		if (isZero) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(sb);
		}
	}
}
