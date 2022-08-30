package algo;

import java.math.BigInteger;
import java.util.Scanner;

public class B1837_암호제작 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger p = sc.nextBigInteger();
		int k = sc.nextInt();

		for (int i = 2; i < k; i++) {
			BigInteger b = new BigInteger(Integer.toString(i));
			if (p.mod(b).compareTo(BigInteger.ZERO) == 0) {
				System.out.println("BAD " + i);
				return;
			}
		}
		System.out.println("GOOD");
	}
}
