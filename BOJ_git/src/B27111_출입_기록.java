package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B27111_출입_기록 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (map.containsKey(a)) {
				if (b == 0) {
					map.remove(a);
				} else {
					ans++;
				}
			} else {
				if (b == 0) {
					ans++;
				} else {
					map.put(a, b);
				}
			}
		}
		ans += map.size();

		System.out.println(ans);
	}
}
