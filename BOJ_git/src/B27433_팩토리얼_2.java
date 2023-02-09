package BOJ;

import java.util.Scanner;

public class B27433_팩토리얼_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;

		while (true) {
			if (n <= 1) {
				break;
			}
			ans *= n;
			n--;
		}
		System.out.println(ans);
	}
}
