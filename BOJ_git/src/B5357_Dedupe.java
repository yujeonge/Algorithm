package BOJ;

import java.util.Scanner;

public class B5357_Dedupe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			sb.append(str.charAt(0));
			for (int j = 0; j < str.length() - 1; j++) {
				if (str.charAt(j) != str.charAt(j + 1)) {
					sb.append(str.charAt(j + 1));
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
