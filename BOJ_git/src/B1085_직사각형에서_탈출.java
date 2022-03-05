

import java.util.Scanner;

public class B1085_직사각형에서_탈출 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int wid = (w - x) < x ? (w - x) : x;
		int hei = (h - y) < y ? (h - y) : y;

		if (wid < hei)
			System.out.println(wid);
		else
			System.out.println(hei);
	}
}
