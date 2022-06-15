

import java.util.Scanner;

public class B14652_나는_행복합니다 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt(); // 관중석 번호
		int temp = 0;

		Loop: for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (temp == K) {
					System.out.println(i + " " + j);
					break Loop;
				}
				temp++;
			}
		}
	}
}
