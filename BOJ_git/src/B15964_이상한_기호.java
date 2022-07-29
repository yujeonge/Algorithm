package algo2;

import java.util.Scanner;

public class B15964_이상한_기호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println((a+b)*(a-b));
	}
}
