

import java.util.Scanner;

public class B5554_심부름_가는_길 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
		int x = time / 60;
		int y = time % 60;
		System.out.println(x);
		System.out.println(y);
	}
}
