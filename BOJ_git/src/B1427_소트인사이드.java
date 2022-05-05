

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1427_소트인사이드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char[] arr = str.toCharArray();
		// 정렬하기
		Arrays.sort(arr);
		// 출력하기
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		System.out.println(sb);

	}
}
