

import java.util.Scanner;

public class B10872_팩토리얼 {
	
	static int ans = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println(1);
		} else {
			factorial(n);
		}
	}

	public static void factorial(int n) {
		if (n == 1) {
			System.out.println(ans);
			return;
		} else {
			ans *= n;
			factorial(n - 1);
		}
	}
}
