

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018_체스판_다시_칠하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][]ch = new char[n][m];
		
		// 체스판 입력받기
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				ch[i][j] = str.charAt(j);
			}
		}
		int min = Integer.MAX_VALUE; //최소값 저장할 변수
		
		// 시작점찾기
		for (int i = 0; i < n - 7; i++)
			for (int j = 0; j < m - 7; j++) {
				int a = 0; //WBWB...일때 수정 횟수
				int b = 0; //BWBW...일때 수정 횟수
				
				// 끝점까지 수정횟수 찾기
				for (int i2 = i; i2 < i + 8; i2++)
					for (int j2 = j; j2 < j + 8; j2++) {
						if (i2 % 2 == 0) { //짝수번째 줄
							if (j2 % 2 == 0) { //짝수번째 원소 
								if (ch[i2][j2] == 'W') a++; //짝짝이 W이면 a++
								else b++; //짝홀이 B이면 b++
							} else { //짝수번째 홀수번째 원소 =
								if (ch[i2][j2] == 'B') a++; //짝홀이 B이면 a++
								else b++; //짝홀이 W이면 b++
							}
						} else { //홀수번째 줄
							if (j2 % 2 == 0) { //짝수번째 원소
								if (ch[i2][j2] == 'B') a++; //홀짝이 B이면 a++
								else b++; //짝짝이 W이면 b++
							} else {
								if (ch[i2][j2] == 'W') a++;
								else b++;
							}
						}
					}
				min = Math.min(min, Math.min(a, b)); //최솟값 구하기
			}
		System.out.println(min);
	}
}