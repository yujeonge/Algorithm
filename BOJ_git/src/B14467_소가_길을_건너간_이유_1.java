package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B14467_소가_길을_건너간_이유_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashMap<Integer, Integer> hash = new HashMap<>();
		int ans = 0;
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			int position = Integer.parseInt(st.nextToken());

			if (!hash.containsKey(cow)) {
				hash.put(cow, position);
			} else {
				if (hash.get(cow) != position) {
					ans++;
					hash.replace(cow, position);
				}
			}
		}
		System.out.println(ans);
	}
}
