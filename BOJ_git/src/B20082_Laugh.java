package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B20082_Laugh {
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		hsol(str, 0);
		System.out.println(ans);
	}

	public static void hsol(String str, int index) {
		int hTemp = 0;
		int strLength = str.length();
		// sol 메소드 종료조건
		if (index == strLength) {
			return;
		}

		while (true) {
			// while 종료조건
			if (index == strLength) {
				break;
			}

			// h일때
			if (str.charAt(index) == 'h') {
				while (true) {
					if (str.charAt(index) == 'h') {
						hTemp++;
						ans = Math.max(ans, hTemp);
						index++;
						if (index == strLength) {
							return;
						}
						if (str.charAt(index) == 'a') {
							hTemp++;
							index++;
							ans = Math.max(ans, hTemp);
							if (index == strLength) {
								return;
							}
						}
					} else {
						hTemp = 0;
						index++;
						hsol(str, index);
					}
				}
			}
			// a일떄
			else if (str.charAt(index) == 'a') {
				while (true) {
					if (str.charAt(index) == 'a') {
						hTemp++;
						ans = Math.max(ans, hTemp);
						index++;
						if (index == strLength) {
							return;
						}
						if (str.charAt(index) == 'h') {
							hTemp++;
							index++;
							ans = Math.max(ans, hTemp);
							if (index == strLength) {
								return;
							}
						}
					} else {
						hTemp = 0;
						index++;
						hsol(str, index);
					}
				}
			} else {
				index++;
			}
		} // while

	}
}
