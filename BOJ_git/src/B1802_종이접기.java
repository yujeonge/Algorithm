

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1802_종이접기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()); //tc갯수

		for (int n = 0; n < t; n++) {
			String str = br.readLine();

			if (str.length() == 1) { 
				sb.append("YES").append('\n');
				continue;
			}

			int len = str.length();
			int idx = len / 2;
			
			boolean stop = false;

			while (idx != 0) {
				for (int i = 0, j = len - 1; i < idx; i++, j--) {
					if (str.charAt(i) == str.charAt(j)) {
						stop = true;
						break;
					}
				}
				if (stop) break;
				len /= 2;
				idx /= 2;
			}
			if (stop) sb.append("NO").append('\n');
			else sb.append("YES").append('\n');
		}

		System.out.println(sb);

	}
}