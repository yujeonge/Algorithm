package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15820_맞았는데_왜_틀리죠 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());

		for (int i = 0; i < s1; i++) {
			st = new StringTokenizer(br.readLine());
			int ans = Integer.parseInt(st.nextToken());
			int mAns = Integer.parseInt(st.nextToken());
			if (ans != mAns) {
				System.out.println("Wrong Answer");
				return;
			}
		}

		for (int i = 0; i < s2; i++) {
			st = new StringTokenizer(br.readLine());
			int ans = Integer.parseInt(st.nextToken());
			int mAns = Integer.parseInt(st.nextToken());
			if (ans != mAns) {
				System.out.println("Why Wrong!!!");
				return;
			}
		}
		System.out.println("Accepted");
	}
}
