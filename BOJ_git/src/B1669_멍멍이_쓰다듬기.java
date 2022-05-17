

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1669_멍멍이_쓰다듬기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int t = y - x; // 늘려야하는 키
		long n = 0;
		if (t == 0) {
			System.out.println(0);
			return;
		}
		while (n * n < t) {
			n++;
		}
		if (n * n != t)
			n --;
		long ans = 2 * n - 1;
		t -= n * n;

		while (t > 0) {
			t -= Math.min(n, t);
			ans++;
		}

		System.out.println(ans);
	}
}