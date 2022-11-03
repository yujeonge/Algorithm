package algo;

import java.util.Scanner;

public class B20833_Kuber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += Math.pow(i, 3);
		}
		
		System.out.println(ans);
	}
}
