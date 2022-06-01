

import java.util.Scanner;

public class B2845_파티가_끝나고_난_뒤 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int L = sc.nextInt(); // 1m^2당 사람의 수
		int P = sc.nextInt(); // 파티가 열렸던 곳의 넓이

		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			n = n - (L * P);
			sb.append(n).append(' ');
		}
		System.out.println(sb);
	}
}
