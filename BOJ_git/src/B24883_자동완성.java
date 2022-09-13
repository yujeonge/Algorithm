package algo;

import java.util.Scanner;

public class B24883_자동완성 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (str.equals("N") || str.equals("n")) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
	}
}
