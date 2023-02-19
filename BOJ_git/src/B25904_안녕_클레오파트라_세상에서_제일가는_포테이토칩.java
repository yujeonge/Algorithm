package BOJ;

import java.util.Scanner;

public class B25904_안녕_클레오파트라_세상에서_제일가는_포테이토칩 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int index = 1;

		while (true) {
			if (arr[index] < x) {
				break;
			}

			x++;
			index++;

			if (index > n) {
				index = 1;
			}

		}
		System.out.println(index);
	}
}
