package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class B26711_AaddB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger ans = sc.nextBigInteger().add(sc.nextBigInteger());
		System.out.println(ans);
	}
}
