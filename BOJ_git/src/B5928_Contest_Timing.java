package algo;

import java.util.Scanner;

public class B5928_Contest_Timing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();

		int time1 = 11 * 60 * 24 + 11 * 60 + 11;
		int time2 = d * 60 * 24 + h * 60 + m;

		int ans = time2 - time1;

		System.out.println(ans < 0 ? -1 : ans);
	}
}
