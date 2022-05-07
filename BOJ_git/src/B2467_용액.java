

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2467_용액 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];
		int[] ans = new int[2];
		int temp = Integer.MAX_VALUE;

		// 입력받기
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		// 용액 선택
		Loop: for (int i = 0; i < n; i++) {
			int start = i + 1;
			int end = n - 1;

			while (start <= end) {
				int mid = (start + end) / 2;
				int sum = list[i] + list[mid];

				if (Math.abs(sum) < temp) {
					ans[0] = list[i];
					ans[1] = list[mid];
					temp = Math.abs(sum);
				}

				if (sum < 0) {
					start = mid + 1;
				} else if (sum > 0) {
					end = mid - 1;
				} else {
					break Loop;
				}
			}
		}

		System.out.println(ans[0] + " " + ans[1]);
	}
}
