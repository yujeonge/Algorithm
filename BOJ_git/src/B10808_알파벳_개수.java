package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] alph = new int[26];
		for (int i = 0; i < str.length(); i++) {
			alph[(int) str.charAt(i) - 'a']++;
		}
		for (int i = 0; i < alph.length; i++) {
			sb.append(alph[i]).append(' ');
		}
		System.out.println(sb);
	}
}
