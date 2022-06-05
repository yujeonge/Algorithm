

import java.util.Scanner;

public class B4101_크냐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int A = sc.nextInt();
		int B = sc.nextInt();
		do {
			if (A > B) sb.append("Yes").append('\n');
			else sb.append("No").append('\n');
			A = sc.nextInt();
			B = sc.nextInt();
		} while (A != 0 && B != 0);
		System.out.println(sb);
	}
}
