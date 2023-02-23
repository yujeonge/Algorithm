package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class B16428_AdivBsub3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		if (b.compareTo(BigInteger.ZERO) == -1) {
			b = b.abs();
			System.out.println("-" + a.divide(b));
			System.out.println(a.mod(b));
		} else {
			System.out.println(a.divide(b));
			System.out.println(a.mod(b));
		}
	}
}
