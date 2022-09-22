package algo;

import java.util.Scanner;

public class B10886_0_not_cute_1_cute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int no = 0;
		int yes = 0;
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() == 0) {
				no++;
			} else {
				yes++;
			}
		}
		String str = no > yes ? "Junhee is not cute!" : "Junhee is cute!";
		System.out.println(str);
	}
}
