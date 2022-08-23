package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11365_밀비_급일 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (!str.equals("END")) {
			char[] ch = str.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				sb.append(ch[i]);
			}
			sb.append('\n');
			str = br.readLine();
		}

		System.out.println(sb);
	}
}
