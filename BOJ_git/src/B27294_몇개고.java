package BOJ;

import java.util.Scanner;

public class B27294_몇개고 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int s = sc.nextInt();

		if (s == 1 || t > 16 || t < 12) {
			System.out.println(280);
		} else {
			System.out.println(320);
		}
	}
}
