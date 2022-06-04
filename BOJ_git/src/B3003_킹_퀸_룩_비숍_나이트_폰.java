

import java.io.IOException;
import java.util.Scanner;

public class B3003_킹_퀸_룩_비숍_나이트_폰 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int[] cnt = new int[6];
		int[] arr = new int[] { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < 6; i++) {
			cnt[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] - cnt[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
