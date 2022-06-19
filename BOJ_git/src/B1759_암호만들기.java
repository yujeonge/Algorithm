

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1759_암호만들기 {
	static int L, C;
	static char alpa[], select[];
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		L = Integer.parseInt(st.nextToken()); // 암호 자리수
		C = Integer.parseInt(st.nextToken()); // 사용했을 법한 문자의 종류

		alpa = new char[C];
		select = new char[L];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			alpa[i] = st.nextToken().charAt(0);
		}

		// 문자열 정렬
		Arrays.sort(alpa);

		comb(0, 0, 0, 0);

		System.out.println(sb);
	}

	// 최소 한 개의 모음과 최소 두 개의 자음으로 구성
	private static void comb(int idx, int cnt, int v, int c) {
		// 조합이 완성되었을 경우
		if (cnt == L) {
			if (v >= 1 && c >= 2) {
				for (int i = 0; i < L; i++) {
					sb.append(select[i]);
				}
				sb.append('\n');
			}

			return;
		}

		for (int i = idx; i < C; i++) {
			select[cnt] = alpa[i];

			if (alpa[i] == 'a' || alpa[i] == 'e' || alpa[i] == 'i' || alpa[i] == 'o' || alpa[i] == 'u') // 모음이면
				comb(i + 1, cnt + 1, v + 1, c);
			else
				comb(i + 1, cnt + 1, v, c + 1); // 자음
		}
	}

}
