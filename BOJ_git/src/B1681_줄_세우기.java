package BOJ;

import java.util.Scanner;

public class B1681_줄_세우기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String strl = Integer.toString(l);

		int[] arr = new int[n];
		int num = 1;

		for (int i = 0; i < n; i++) {

			while (true) {
				String str = Integer.toString(num);
				if (str.contains(strl)) {
					num++;
				} else {
					break;
				}
			}

			arr[i] = num;
			num++;
		}

		System.out.println(arr[n - 1]);
	}

}
