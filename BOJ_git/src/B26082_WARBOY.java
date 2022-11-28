package algo;

import java.util.Scanner;

public class B26082_WARBOY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int i = b / a;
		int ans = 3*i*c;

		System.out.println(ans);
	}
}
