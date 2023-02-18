package BOJ;

import java.util.Scanner;

public class B16204_카드_뽑기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 총 카드 갯수
		int m = sc.nextInt(); // 앞면에 o인 카드 갯수
		int k = sc.nextInt(); // 적을 수 있는 o의 갯수

		int oCnt = Math.min(m, k);
		int xCnt = Math.min(n - m, n - k);

		System.out.println(oCnt + xCnt);
	}
}
