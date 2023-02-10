package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B13410_거꾸로_구구단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[k + 1];

		for (int j = 1; j <= k; j++) {
			int temp = n * j;
			StringBuffer str = new StringBuffer(Integer.toString(temp));
			str = str.reverse();
			arr[j] = Integer.parseInt(str.toString());

		}

		Arrays.sort(arr);

		System.out.println(arr[arr.length - 1]);
	}
}
