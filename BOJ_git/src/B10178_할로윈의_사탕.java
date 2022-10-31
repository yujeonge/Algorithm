package algo;

import java.util.Scanner;

public class B10178_할로윈의_사탕 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int v = sc.nextInt();
			sb.append("You get " + c / v + " piece(s) and your dad gets " + c % v + " piece(s).\n");
		}
		System.out.println(sb);
	}
}
