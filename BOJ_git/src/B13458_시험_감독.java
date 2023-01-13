

import java.util.Scanner;

public class B13458_시험_감독 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int B = sc.nextInt();
		int C = sc.nextInt();
		long ans = 0;

		for (int i = 0; i < N; i++) {
			int temp = a[i];
			temp -= B;
			ans++;
			if (temp <= 0) {
				continue;
			} else {
				if (temp % C == 0) {
					ans += temp / C;
				} else {
					ans += temp / C + 1;
				}
			}
		}
		System.out.println(ans);
	}
}
