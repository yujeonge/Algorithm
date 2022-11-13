package algo;

import java.util.Scanner;

public class B7891_Can_you_add_this {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt() + sc.nextInt();
			sb.append(temp).append('\n');
		}
		
		System.out.println(sb);
	}
}
