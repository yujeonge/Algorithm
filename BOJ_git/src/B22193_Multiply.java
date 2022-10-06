package algo;

import java.math.BigInteger;
import java.util.Scanner;

public class B22193_Multiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		System.out.println(a.multiply(b));
	}
}
