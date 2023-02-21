package BOJ;

import java.util.Scanner;

public class B14720_우유_축제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int milk = 0; // 먹어야하는 우유
		int ans = 0;
		int nowMilk; // 현재 먹은 우유
		while (true) {
			nowMilk = sc.nextInt();
			n--;
			if (nowMilk == 0) {
				ans++;
				milk++;
				break;
			}
		}

		for (int i = 0; i < n; i++) {
			nowMilk = sc.nextInt();
			if (nowMilk == milk) {
				ans++;
				milk++;
				if (milk == 3) {
					milk = 0;
				}
			}
		}

		System.out.println(ans);
	}
}
