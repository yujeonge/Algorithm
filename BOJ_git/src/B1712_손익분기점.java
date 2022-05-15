

import java.util.Scanner;

public class B1712_손익분기점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (C - B <= 0) {
				System.out.println("-1");
				break;
			}
			if (A / (C - B) < i) {
				System.out.println(i);
				break;
			}
		}
	}
}