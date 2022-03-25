

import java.util.Scanner;

public class B1436_영화감독_숌 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int num = 0;
		while (N != cnt) {
			num++;
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
	}
}
