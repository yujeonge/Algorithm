package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4493_가위_바위_보 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		// test case
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int p1 = 0;
			int p2 = 0;

			// 가위바위보 한 횟수만큼
			for (int j = 0; j < n; j++) {
				String str = br.readLine();
				char cp1 = str.charAt(0);
				char cp2 = str.charAt(2);

				if (cp1 == 'R') { // 바위
					if (cp2 == 'P') { // 보
						p2++;
					} else if (cp2 == 'S') { // 가위
						p1++;
					}
				} else if (cp1 == 'P') { // 보
					if (cp2 == 'S') { // 가위
						p2++;
					} else if (cp2 == 'R') { // 바위
						p1++;
					}
				} else { // 가위
					if (cp2 == 'R') { // 바위
						p2++;
					} else if (cp2 == 'P') { // 보
						p1++;
					}
				}
			}

			if (p1 > p2) {
				sb.append("Player 1").append('\n');
			} else if (p1 == p2) {
				sb.append("TIE").append('\n');
			} else {
				sb.append("Player 2").append('\n');
			}
		}
		System.out.println(sb);
	}
}
