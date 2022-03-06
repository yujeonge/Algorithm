

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1244_스위치_켜고_끄기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) + 1; // 스위치 번호와 배열 인덱스를 맞추기 위해서
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] s = new int[N]; // 스위치 상태를 입력받을 배열
		int students = Integer.parseInt(br.readLine()); // 학생 수 입력받기

		// 스위치 상태 입력받기
		for (int i = 1; i < N; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}

		// 학생 수 만큼 반복
		for (int i = 0; i < students; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken()); // 성별
			int sNum = Integer.parseInt(st.nextToken()); // 받은 스위치 번호

			switch (gender) {
			case 1: // 성별이 남자이면
				for (int j = 1; j * sNum < N; j++) { // 배수가 스위치 갯수를 넘으면 안됨
					s[j * sNum] = s[j * sNum] == 1 ? 0 : 1; // 받은 수의 배수들의 스위치 상태를 바꾼다
				}
				break;

			case 2: // 여자이면
				s[sNum] = s[sNum] == 1 ? 0 : 1; // 받은 수의 스위치 번호의 상태를 바꿈
				
				for (int j = 1; sNum + j < N; j++) { // 상태를 바꿀 스위치의 번호가 N을 넘어가면 안됨
					if (sNum - j > 0 && sNum + j < N && s[sNum - j] == s[sNum + j]) { // 범위체크, 대칭체크
						s[sNum - j] = s[sNum - j] == 1 ? 0 : 1; // 스위치 상태 바꾸기
						s[sNum + j] = s[sNum - j];
					}else  break; //
					}
			}
		}

		// 최종 스위치 상태 출력
		for (int i = 1; i < N; i++) {
			System.out.print(s[i] + " ");
			if(i>19 && i%20== 0) System.out.println();
			
		}

	}
}

