package BOJ;

import java.util.Scanner;

public class B10798_세로읽기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[] arr = new String[5];
		int maxLength = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextLine();
			maxLength = Math.max(maxLength, arr[i].length());
		}

		for (int j = 0; j < maxLength; j++) {
			for (int i = 0; i < 5; i++) {
				try {
					sb.append(arr[i].charAt(j));
				} catch (Exception e) {
				}
			}
		}

		System.out.println(sb);
	}
}
