

import java.util.Scanner;

/*첫째 줄에 시험장의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 각 시험장에 있는 응시자의 수 Ai (1 ≤ Ai ≤ 1,000,000)가 주어진다.
->최악의 경우 범위 조심*/
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
