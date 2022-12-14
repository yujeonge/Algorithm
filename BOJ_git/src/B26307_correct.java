package BOJ;

import java.util.Scanner;

public class B26307_correct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int ans = (h - 9) * 60 + m;
		
		System.out.println(ans);
	}
}
