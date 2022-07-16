package BOJ;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = 0;
		if (str.length() == 2) {
			ans = Integer.parseInt(str.substring(0, 1));
			ans += Integer.parseInt(str.substring(1, 2));
		} else if (str.length() == 3) {
			if (str.charAt(1) == '0') {
				ans = Integer.parseInt(str.substring(0, 2));
				ans += Integer.parseInt(str.substring(2, 3));
			} else {
				ans = Integer.parseInt(str.substring(0, 1));
				ans += Integer.parseInt(str.substring(1, 3));
			}
		} else {
			ans = Integer.parseInt(str.substring(0, 2));
			ans += Integer.parseInt(str.substring(2, 4));
		}
		System.out.println(ans);
	}
}
