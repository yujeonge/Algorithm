package algo;

import java.util.Scanner;

public class B5524_�Խǰ��� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			sb.append(sc.nextLine().toLowerCase()).append('\n');
		}

		System.out.println(sb);
	}
}
