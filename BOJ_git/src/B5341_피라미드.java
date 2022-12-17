package BOJ;

import java.util.Scanner;

public class B5341_피라미드 {

	static int temp;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			} else {
				temp = 0;
				sum(n);
			}
		}

		System.out.println(sb);
	}

	public static void sum(int n) {
		temp += n;
		n--;

		if (n == 0) {
			sb.append(temp).append('\n');
			return;
		} else {
			sum(n);
		}
	}
}
