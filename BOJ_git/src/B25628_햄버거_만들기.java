package algo;

import java.util.Scanner;

public class B25628_�ܹ���_����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = Math.min(a/2, b);
		
		System.out.println(max);
	}
}
