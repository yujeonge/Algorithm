package algo2;

import java.io.IOException;
import java.util.Scanner;

public class B11943_과일_옮기기 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[2];
		int[] B = new int[2];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}

		System.out.println(Math.min(A[0] + B[1], A[1] + B[0]));

	}
}