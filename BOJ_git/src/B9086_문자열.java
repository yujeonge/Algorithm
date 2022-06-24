

import java.util.Scanner;

public class B9086_문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			String str = sc.next();
			sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append('\n');
		}
		System.out.println(sb);
	}
}
