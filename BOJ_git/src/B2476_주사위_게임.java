package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2476_주사위_게임 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int ans = 0;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int num3 = Integer.parseInt(st.nextToken());
			int temp = 0;
			if (num == num2 && num2 == num3) {
				temp = 10000 + (num2 * 1000);
			} else if (num == num2) {
				temp = 1000 + (num * 100);
			} else if (num2 == num3) {
				temp = 1000 + (num2 * 100);
			} else if (num == num3) {
				temp = 1000 + (num * 100);
			} else {
				temp = Math.max(num, Math.max(num2, num3)) * 100;
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}
}
