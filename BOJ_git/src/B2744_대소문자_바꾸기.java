

import java.util.Scanner;

public class B2744_대소문자_바꾸기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c <= 122 && c >= 97) {
				int ch = (int) c - 32;
				sb.append((char) ch);
			} else {
				int ch = (int) c + 32;
				sb.append((char) ch);
			}
		}
		
		System.out.println(sb);
	}
}
