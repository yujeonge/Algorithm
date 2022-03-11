

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5525_IOIOI {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N+1개의 I와 N개의 O
		int M = Integer.parseInt(br.readLine()); // 문자열 길이
		String str = br.readLine();
		char[] ch = new char[M + 1];
		
		for (int i = 0; i < M; i++) {
			ch[i] = str.charAt(i);
		}

		int ans = 0;
		for (int i = 1; i < M; i++) { // 배열 범위를 벗어나지 않기위해
			int cnt = 0;

			if (ch[i - 1] == 'I') { //I찾고
				while (ch[i] == 'O' && ch[i + 1] == 'I') { //OI찾기
					i += 2; //OI를 찾았으니 다음 인덱스 확인하기
					cnt++; //OI갯수 카운팅
					if (cnt == N) { //연속된 OI가 N과 같다면
						cnt--; //cnt 중복이 있을 수 있으므로 한번 제거
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}