package algo;

import java.util.Scanner;

public class B25625_��Ʋ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // ���� �� �ð�
		int y = sc.nextInt(); // y�� �� �� 2���а����� ���

		if (x < y) {
			System.out.println(y - x);
		} else {
			System.out.println(x + y);
		}
	}
}
