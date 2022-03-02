

import java.util.Scanner;

public class B2775_부녀회장이_될테야 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int K = sc.nextInt();
			int N = sc.nextInt();

			int arr[][] = new int[15][15]; //인덱스 맞추려고

			// 0층 주민 수
			for (int j = 1; j <= N; j++) {
				arr[0][j] = j;
			}

			for (int i = 1; i <= K; i++) { //층
				for (int j = 1; j <= N; j++) { //호
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j]; 
				}
			}

			System.out.println(arr[K][N]);
		}
	}
}