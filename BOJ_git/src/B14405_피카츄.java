package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14405_피카츄 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			if (i + 2 <= str.length() && str.substring(i, i + 2).equals("pi")) {
				i++;
				if (i == str.length() - 1) {
					break;
				}
			} else if (i + 2 <= str.length() && str.substring(i, i + 2).equals("ka")) {
				i++;
				if (i == str.length() - 1) {
					break;
				}
			} else if (i + 3 <= str.length() && str.substring(i, i + 3).equals("chu")) {
				i += 2;
				if (i == str.length() - 1) {
					break;
				}
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
