

import java.util.Scanner;

public class B10039_평균_점수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			int t = sc.nextInt();
			if (t < 40) {
				t = 40;
			}
			ans += t;
		}
		System.out.println(ans/5);
	}
}
