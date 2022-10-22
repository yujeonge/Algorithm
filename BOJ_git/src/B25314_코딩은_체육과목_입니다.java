package algo;

import java.util.Scanner;

public class B25314_ÄÚµùÀº_Ã¼À°°ú¸ñ_ÀÔ´Ï´Ù {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		for (int i = 0; i < (n / 4); i++) {
			sb.append("long ");
		}
		sb.append("int");

		System.out.println(sb);
	}
}
