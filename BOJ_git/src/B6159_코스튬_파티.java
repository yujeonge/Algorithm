package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B6159_ÄÚ½ºÆ¬_ÆÄÆ¼ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N;
		int S;
		int[] cows;
		int cnt = 0;
		int end = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		cows = new int[N];

		for (int i = 0; i < N; i++)
			cows[i] = Integer.parseInt(br.readLine());

		Arrays.sort(cows);
		for (int start = 0; start < N - 1; start++) {
			end = start + 1;
			if (cows[start] >= S)
				break;
			while (end < N && cows[start] + cows[end] <= S) {
				cnt++;
				end++;
			}
		}

		System.out.println(cnt);
	}
}