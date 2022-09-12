package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1037_약수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// 입력받기
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			min = Math.min(min, temp);
			max = Math.max(max, temp);
		}
		System.out.println(min * max);
	}
}
