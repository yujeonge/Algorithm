package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047_����_0 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] coins = new int[n];
		int index = 0;
		int ans = 0;

		// �Է� �ޱ�
		for (int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
			if (k >= coins[i]) {
				index = i;
			}
		}

		for (int i = index; i >= 0; i--) {
			ans += (k / coins[i]);
			k %= coins[i];
			if (k == 0) {
				break;
			}
		}

		System.out.println(ans);
	}
}
