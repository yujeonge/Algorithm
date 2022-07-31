package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1100_하얀_칸 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] map = new char[9][8]; // 체스 판
		int cnt = 0;
		// 입력받기
		for (int i = 1; i < 9; i++) {
			String str = br.readLine();
			for (int j = 0; j < 8; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		// 하얀칸에 F가 몊개 있는지 롹인
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (j % 2 != 0) {
						if (map[i][j] == 'F')
							cnt++;
					}
				}
				else {
					if (j % 2 == 0) {
						if (map[i][j] == 'F')
							cnt++;
					}
				}

			}
		}
		System.out.println(cnt);
	}
}
