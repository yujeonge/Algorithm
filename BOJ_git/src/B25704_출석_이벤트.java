package algo;

import java.util.Scanner;

public class B25704_출석_이벤트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int min = p;

		if (n >= 5) {
			if (p >= 500) {
				min = Math.min(p - 500, min);
			} else {
				min = Math.min(0, min);
			}
		}
		if (n >= 10) {
			min = Math.min((int) (p * 0.9), min);
		}
		if (n >= 15) {
			if (p >= 2000) {
				min = Math.min((p - 2000), min);
			} else {
				min = Math.min(0, min);
			}
		}
		if (n >= 20) {
			min = Math.min((int) (p * 0.75), min);
		}

		System.out.println(min);
	}
}
