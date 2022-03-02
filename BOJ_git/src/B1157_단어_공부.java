

import java.util.Scanner;

public class B1157_단어_공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int[] alpha = new int[26];// 알파벳
		int max = 0;
		int maxindex = alpha[0];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((int) ch < 95) {
				int index = ch - 'A';
				;
				alpha[index] += 1;

			} else {
				int index = ch - 'a';

				alpha[index] += 1;
			}
		}

		for (int i = 0; i < alpha.length; i++) {
			if (maxindex == alpha[i]) {
				max = 63;
			} else if (maxindex < alpha[i]) {
				maxindex = alpha[i];
				max = i + 'A';

			}
		}
		System.out.println((char) (max));
	}
}
