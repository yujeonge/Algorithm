package BOJ;

import java.util.Scanner;

public class B5354_J박스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int tc = sc.nextInt();
		// tc만큼
		for (int i = 0; i < tc; i++) {
			int n = sc.nextInt();

			if (n == 1) {
				sb.append('#').append('\n').append('\n');
				continue;
			} 
			// 제일 윗줄 #
			for (int j = 0; j < n; j++) {
				sb.append('#');
			}
			// 중간 박스 부분
			for (int j2 = 0; j2 < n - 2; j2++) {
				sb.append('\n').append('#');
				for (int j = 0; j < n - 2; j++) {
					sb.append('J');
				}
				sb.append('#');
			}
			sb.append('\n');
			// 제일 밑 줄 #
			for (int j = 0; j < n; j++) {
				sb.append('#');
			}
			sb.append('\n').append('\n');
		}
		System.out.println(sb);
	}
}
