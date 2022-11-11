package algo;

import java.util.Scanner;

public class B23235_The_Fastest_Sorting_Algorithm_In_The_World {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int i = 1;
		String str = sc.nextLine();
		do {
			sb.append("Case ").append(i).append(": Sorting... done!").append('\n');
			str = sc.nextLine();
			i++;
		} while (!str.equals("0"));
		System.out.println(sb);
	}
}
