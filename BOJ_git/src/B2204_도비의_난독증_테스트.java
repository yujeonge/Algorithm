package BOJ;

import java.util.Scanner;

public class B2204_도비의_난독증_테스트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			String ans = sc.next();
			String ansTemp = ans.toLowerCase();

			for (int i = 0; i < n - 1; i++) {
				String str = sc.next();
				String strTemp = str.toLowerCase();
				int num = Math.min(ans.length(), str.length());

				if (str.length() == num) {
					String temp = ans;
					ans = str;
					str = temp;
					ansTemp = ans.toLowerCase();
					strTemp = str.toLowerCase();
				}

				for (int j = 0; j < num; j++) {
					if (ansTemp.charAt(j) < strTemp.charAt(j)) {
						break;
					} else if (ansTemp.charAt(j) > strTemp.charAt(j)) {
						ans = str;
						break;
					}
				} // 비교 for 문
			} // tc도는 for 문
			sb.append(ans).append('\n');
		} // while 문

		System.out.println(sb);
	}
}
