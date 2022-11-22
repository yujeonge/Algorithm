package algo;

import java.util.Scanner;

public class B6763_Speed_fines_are_not_fine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b - a;
		if (c < 1) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (c < 21) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (c < 31) {
			System.out.println("You are speeding and your fine is $270.");
		} else {
			System.out.println("You are speeding and your fine is $500.");
		}
	}
}
