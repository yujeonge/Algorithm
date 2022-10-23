package algo;

import java.util.Scanner;

public class B25372_성택이의_은밀한_비밀번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			if (str.length() >= 6 && str.length() <= 9) {
				sb.append("yes").append('\n');
			} else {
				sb.append("no").append('\n');
			}
		}
		System.out.println(sb);
	}
}
