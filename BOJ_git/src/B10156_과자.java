package BOJ;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();

		k = k * n;
		k -= m;

		k = k < 0 ? 0 : k;
		
		System.out.println(k);
	}
}
