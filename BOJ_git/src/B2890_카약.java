package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2890_카약 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] arr = new int[10];
		int[] ans = new int[10];
		int max = Integer.MIN_VALUE;
		int rank = 1;

		// arr배열에 얼마만큼 갔는지 입력받기
		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			arr[0] = 0; // arr[0]초기화
			for (int j = 1; j < c; j++) {
				if (str.charAt(j) == '.') { // 물 표시이면
					arr[0]++; // arr[0]++
				} else {
					if (str.charAt(j) - '0' > 9) { // 빈 라인이면 다음 라인 확인
						continue;
					} else {
						arr[str.charAt(j) - '0'] = arr[0]; // 해당 팀의 arr에 arr[0]의 값 넣어주기
						max = Math.max(max, arr[str.charAt(j) - '0']); // 가장 멀리 간 거리 구하기
						break;
					}
				}
			}
		}

		// 9팀이니까 최대 9번 반복됨
		for (int ii = 0; ii < 9; ii++) {

			for (int i = 1; i < 10; i++) {
				if (arr[i] == max) { // max만큼 간 팀이 여러팀이면
					ans[i] = rank; // 해당 팀에 같은 rank넣어주기
				}
			}
			int temp = max;// max값을 임시 변수 temp에 넣어둠
			max = Integer.MIN_VALUE; // max초기화

			for (int i = 0; i < 10; i++) {
				if (arr[i] >= temp) { // temp값보다 크면 이미 등수가 정해진 팀
					continue;
				} else {
					max = Math.max(max, arr[i]); // 다음으로 멀리 간 거리 구하기
				}
			}
			rank++; // 다음 등수 확인
		}

		// 출력
		for (int i = 1; i < 10; i++) {
			System.out.println(ans[i]);
		}
	}
}
