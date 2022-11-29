package algo;

import java.util.Scanner;

public class B18330_Petrol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		if (n < k + 60) {
			System.out.println((n * 1500));
		} else {
			System.out.println(((n - k - 60) * 3000) + ((k + 60) * 1500));
		}
	}
}
