package algo;

import java.util.Scanner;

public class B23825_SASA_������_������ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min = Math.min(n, m);

		System.out.println(min / 2);
	}
}
