

import java.util.Scanner;

public class B1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 과목의 갯수
		double[] scores = new double[N]; // 점수를 배열로 저장
		double max = scores[0]; // 제일 높은 점수를 배열의 첫번째 인자로 초기화
		double sum = 0; // 과목 총 합 초기화
		double avg = 0.0; // 평균값 초기화
		/* 배열에 점수 넣기 */
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			scores[i] = M;
		}
		/* max값 찾기 */
		for (int i = 0; i < N; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}

		for (int i = 0; i < N; i++) {
			scores[i] = scores[i] / max * 100;
			sum += scores[i];
		}
		avg = sum / N;
		System.out.println(avg);
	}
}
