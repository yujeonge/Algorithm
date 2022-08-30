package algo;

import java.util.Scanner;

public class B16916_부분_문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String s = sc.next();

		System.out.println(str.contains(s) ? 1 : 0);
	}
}
