package algo2;

import java.util.Scanner;

public class B5575_타임_카드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			int sh = sc.nextInt(), sm = sc.nextInt(), ss = sc.nextInt();
			int eh = sc.nextInt(), em = sc.nextInt(), es = sc.nextInt();
			int start = (sh * 3600) + (sm * 60) + ss;
			int end = (eh * 3600) + (em * 60) + es;
			int t = end - start;
			int h = t / 3600;
			int m = (t % 3600) / 60;
			int s = (t % 3600) % 60;

			sb.append(h).append(' ').append(m).append(' ').append(s).append('\n');
		}
		System.out.println(sb);
	}
}