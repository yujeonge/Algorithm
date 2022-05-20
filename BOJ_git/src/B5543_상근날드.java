

import java.util.Scanner;

public class B5543_상근날드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 2000;
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			int n = sc.nextInt();
			min = Math.min(min, n);
		}
		ans = min;
		min = 2000;
		for (int i = 0; i < 2; i++) {
			int n = sc.nextInt();
			min = Math.min(min, n);
		}
		ans += min;
		ans -= 50;
		System.out.println(ans);
	}

}
