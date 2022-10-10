package algo;

import java.util.Scanner;

public class B20254_Site_Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ur = sc.nextInt();
		int tr = sc.nextInt();
		int uo = sc.nextInt();
		int to = sc.nextInt();
		System.out.println((56 * ur) + (24 * tr) + (14 * uo) + (6 * to));
	}
}
