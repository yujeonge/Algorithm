

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2108_통계학 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8001]; // -4000~4000 까지

		double avg = 0; // 산술평균
		int median = 0; // 중앙값
		int mode = 0; // 최빈값

		int medianIndex = N / 2 + 1; // 중앙값을 구할 때 사용하기 위한 index
		int modeIndex = 0; //최빈값을 구할 때 사용하기 위한 index
		int max = -1; // 범위를 구하기 위한
		int min = 8001; // 범위를 구하기 위한

		// 입력
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			avg += temp;
			temp += 4000;
			arr[temp]++; // 1.평균을 구하기 위해 바로 다 더함
		}

		for (int i = 0; i < 8001; i++) {
			if (arr[i] != 0) {
			
				// 2.중앙값구하기
				if (medianIndex >= 1) {
					medianIndex -= arr[i];
					median = i;
				}
				
				// 3.최빈값구하기
				modeIndex = Math.max(modeIndex, arr[i]);
				if (arr[i] == modeIndex)
					mode = i;
				
				//4.범위 구하기
				max = Math.max(max, i);
				min = Math.min(min, i);

			}
		}

		//최빈값이 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력 
		int cnt = 0;
		for (int i = 0; i < 8001; i++) {
			if (arr[i] == modeIndex) {
				cnt++;
				if (cnt == 2) {
					mode = i;
					break;
				}
			}
		}

		// 1.평균
		avg = (double) avg / N;
		if (avg < 0 && avg > -0.5) avg = 0; //반올림시 -0이 아닌 0이 나오게 출력
		System.out.printf("%.0f\n", avg);

		// 2.중앙값
		median -= 4000;
		System.out.println(median);

		// 3.최빈값
		mode -= 4000;
		System.out.println(mode);

		// 4.범위
		min -= 4000;
		max -= 4000;

		System.out.println(max - min);

	}
}
