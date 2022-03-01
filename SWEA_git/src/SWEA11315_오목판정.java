package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA11315_오목판정 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 왼쪽아래,아래,오른쪽아래,오른쪽
		int[] dx = { -1, 0, 1, 1 };
		int[] dy = { 1, 1, 1, 0 };

		// 테케만큼 반복
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			char[][] map = new char[N][N];
			String o = "NO";

			// 오목 판 입력받기
			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j);
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'o') {
						// 4방 탐색하기
						for (int j2 = 0; j2 < 4; j2++) {
							for (int cnt = 1; cnt <= 4; cnt++) { 
								// o의 갯수 카운트, 위에서 1개 찾았으니 4개만 더 찾으면 됨
								int nx = i + dx[j2] * cnt;//한개를 찾았으면 한칸 아래로 check, 두개를 찾았으면 두칸 아래로 check,,,
								int ny = j + dy[j2] * cnt;
								if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
									if(map[nx][ny]!='o') break;
									if(cnt==4) o = "YES";
								}
							}
						}
					}
				}
			}

			sb.append('#').append(test_case).append(' ').append(o).append('\n');
		}
		System.out.println(sb);
	}
}
