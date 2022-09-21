package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5613_계산기_프로그램 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long ans = Long.parseLong(br.readLine());
		String str = br.readLine();
		char c = str.charAt(0);
		while (c != '=') {
			long num2 = Long.parseLong(br.readLine());
			if (c == '+') {
				ans += num2;
			} else if (c == '-') {
				ans -= num2;
			} else if (c == '*') {
				ans *= num2;
			} else if (c == '/') {
				ans /= num2;
			}
			str = br.readLine();
			c = str.charAt(0);
		}
		System.out.println(ans);
	}
}
