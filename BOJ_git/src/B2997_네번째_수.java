package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B2997_네번째_수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int ans = 0;

		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		if (arr[1] - arr[0] == arr[2] - arr[1]) {
			ans = arr[2] + (arr[2] - arr[1]);
		} else {
			int temp = arr[2] - arr[1];
			int num = arr[0] + temp;

			if (num - arr[0] == arr[1] - num && arr[1] - num == temp) {
				ans = num;
			} else {
				temp = arr[1] - arr[0];
				ans = arr[1] + temp;
			}
		}

		System.out.println(ans);
	}
}
