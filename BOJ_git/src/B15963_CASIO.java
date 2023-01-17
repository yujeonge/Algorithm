package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class B15963_CASIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();

		if (n.compareTo(m) == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
