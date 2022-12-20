package BOJ;

import java.util.*;

public class B26574_Copier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			sb.append(num).append(' ').append(num).append('\n');
		}

		System.out.println(sb);
	}
}
