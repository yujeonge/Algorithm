package algo;

import java.util.Scanner;

public class B14264_����������_�ﰢ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double ans = (double) (n * (n * Math.sqrt(3))) / 4;
		System.out.println(ans);
	}
}
