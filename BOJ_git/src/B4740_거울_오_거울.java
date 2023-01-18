package BOJ;

import java.util.Scanner;

public class B4740_거울_오_거울 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = sc.nextLine();

			if (str.equals("***")) {
				break;
			}

			for (int i = str.length() - 1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
