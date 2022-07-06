

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1284_집_주소 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		do {
			int ans = str.length() + 1; // 문자 앞,뒤,사이 총 여백
			for (int i = 0; i < str.length(); i++) {
				int n = str.charAt(i) - '0';
				if (n == 1) {
					ans += 2;
				} else if (n == 0) {
					ans += 4;
				} else {
					ans += 3;
				}
			}
			sb.append(ans).append('\n');
			str = br.readLine();
		} while (!str.equals("0"));
		
		System.out.println(sb);
	}
}
