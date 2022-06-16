

import java.util.Scanner;

public class B1357_뒤집힌_덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		sb.append(X).reverse();
		sb2.append(Y).reverse();
		
		int ans = Integer.parseInt(sb.toString()) + Integer.parseInt(sb2.toString());
		System.out.println(Integer.parseInt(sb3.append(ans).reverse().toString()));
	}
}