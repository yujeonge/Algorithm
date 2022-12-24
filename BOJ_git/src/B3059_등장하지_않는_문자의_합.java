package BOJ;

import java.util.Scanner;

public class B3059_등장하지_않는_문자의_합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {
			String str = sc.next();
			int[] arr = new int[26];
			int ans = 0;

			for (int j = 0; j < str.length(); j++) {
				arr[(int) str.charAt(j) - 65] = 1;
			}

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == 0) {
					ans += (j + 65);
				}
			}
			sb.append(ans).append('\n');
		}
		System.out.println(sb);
	}
}
