package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1371_가장_많은_숫자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[26];
		int max = 0;

		for (int i = 0; i < 50; i++) {
			String str = br.readLine();

			if ((str = br.readLine()) == null) {
				break;
			}

			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == ' ') {
					continue;
				} else {
					arr[(int) ch - 'a']++;
					max = Math.max(max, arr[(int) ch - 'a']);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				char ch = (char) (i + 'a');
				sb.append(ch);
			}
		}

		System.out.println(sb);
	}
}
