package algo;

import java.util.Scanner;

public class B10990_��_���_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		// �ټ�
		for (int i = 0; i < n; i++) {
			// ���� ����
			for (int j = n - 1; j > i; j--) {
				sb.append(' ');
			}
			sb.append('*');
			// ���� ����
			for (int j = 0; j < i * 2 - 1; j++) {
				sb.append(' ');
			}
			if (i > 0) {
				sb.append('*');
			}
			sb.append('\n');
		}

		System.out.println(sb);
	}
}
