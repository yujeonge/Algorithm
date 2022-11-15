package algo;

import java.util.Scanner;

public class B25703_포인터_공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				sb.append("int a;").append('\n');
				sb.append("int *ptr = &a;").append('\n');
			} else {
				sb.append("int ");
				for (int j = 0; j <= i; j++) {
					sb.append('*');
				}
				if (i == 1) {
					sb.append("ptr").append(i + 1).append(" = ").append("&ptr").append(";").append('\n');
				} else {
					sb.append("ptr").append(i + 1).append(" = ").append("&ptr").append(i).append(";").append('\n');
				}
			}
		}
		System.out.println(sb);
	}
}
