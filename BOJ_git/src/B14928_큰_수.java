package algo;

import java.util.Scanner;

public class B14928_Å«_¼ö {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		long ans = 0;
		for (int i = 0; i < str.length(); i++) {
			ans = (ans * 10 + (str.charAt(i) - '0')) % 20000303;
		}

		System.out.println(ans);
	}
}