

import java.util.Scanner;

public class B20492_세금 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println((int) (N * 0.78) + " " + (int) ((N * 0.8) + ((N - (N * 0.8)) * 0.78)));
	}
}
