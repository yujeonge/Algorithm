package algo;

import java.util.Scanner;

public class B4458_첫_문자를_대문자로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			sb.append(Character.toUpperCase(str.charAt(0)));
			if (str.length() > 1) {
				sb.append(str.substring(1, str.length())).append('\n');
			}
		}
		System.out.println(sb);
	}
}
