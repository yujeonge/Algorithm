package algo;

import java.util.Scanner;

public class B25625_샤틀버스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 버스 편도 시간
		int y = sc.nextInt(); // y분 후 제 2공학관으로 출발

		if (x < y) {
			System.out.println(y - x);
		} else {
			System.out.println(x + y);
		}
	}
}
