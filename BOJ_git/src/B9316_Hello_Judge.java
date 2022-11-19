package algo;

import java.util.Scanner;

public class B9316_Hello_Judge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Hello World, Judge " + i + "!");
		}
	}
}
