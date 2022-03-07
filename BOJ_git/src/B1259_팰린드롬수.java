

import java.util.Scanner;

public class B1259_팰린드롬수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int same = 0;
		while (true) {
			String str = sc.next();
			if (str.equals("0"))
				break;
			char[] ch = new char[str.length()];
			char[] ch2 = new char[str.length()];
			for (int i = 0; i < ch.length; i++) {
				ch[i] = str.charAt(i);
			}
			for (int i = 0; i < ch2.length; i++) {
				ch2[ch2.length - 1 - i] = ch[i];
			}
			for (int i = 0; i < ch2.length; i++) {
				int a = ch[i] - '0';
				int b = ch2[i] - '0';

				if (a == b) {
					same++;
				}
			}

			if (same == ch.length) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			same = 0;
		}
	}

}