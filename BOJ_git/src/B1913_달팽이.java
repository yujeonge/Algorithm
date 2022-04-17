

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1913_달팽이 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int ansI = 0;
		int ansJ = 0;

		int[] di = { 1, 0, -1, 0 }; // 하, 우,상,좌
		int[] dj = { 0, 1, 0, -1 };
		int dir = 0; // 방향
		int i = 0;
		int j = 0;

		// 숫자 채워주기
		for (int a = n * n; a > 0; a--) {
			arr[i][j] = a; // 값 넣어주기
			if (a == num) {
				ansI = i + 1;
				ansJ = j + 1;
			}
			i += di[dir]; // 다음 이동할 좌표
			j += dj[dir];

			// 범위를 벗어났다면
			if (i >= n || i < 0 || j >= n || j < 0) {
				i -= di[dir]; // 좌표 되돌리기
				j -= dj[dir];
				dir = (dir + 1) % 4; // 방향전환
				i += di[dir]; // 다시 이동
				j += dj[dir];
			}

			// 이미 값이 있으면
			if (arr[i][j] != 0) {
				i -= di[dir]; // 좌표 되돌리기
				j -= dj[dir];
				dir = (dir + 1) % 4; // 방향전환
				i += di[dir]; // 다시 이동
				j += dj[dir];
			}
		}
		for (int j2 = 0; j2 < n; j2++) {
			for (int k = 0; k < n; k++) {
				sb.append(arr[j2][k]).append(' ');
			}
			sb.append('\n');
		}
		sb.append(ansI).append(' ').append(ansJ);

		System.out.println(sb);

	}
}
