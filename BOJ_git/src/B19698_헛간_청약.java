

import java.util.Scanner;

public class B19698_헛간_청약 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 소의 수
		int W = sc.nextInt(); // 크기
		int H = sc.nextInt(); // 크기
		int L = sc.nextInt(); // 소에게 필요한 면적
		W /= L;
		H /= L;
		int ans = Math.min(N, W * H);
		System.out.println(ans);
	}
}
