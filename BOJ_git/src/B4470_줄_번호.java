package algo;

import java.util.Scanner;

public class B4470_มู_น๘ศฃ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			sb.append(i).append(". ").append(sc.nextLine()).append('\n');
		}
		System.out.println(sb);
	}
}
