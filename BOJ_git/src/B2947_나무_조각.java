package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2947_나무_조각 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] num = new int[5];
		// 입력받기
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		//순서대로가 아니면 연속된 순서 바꾸기
		while (!isOrder(num)) {
			for (int i = 0; i < 4; i++) {
				if (num[i] > num[i + 1]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					for (int j = 0; j < 5; j++) {
						System.out.print(num[j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
	
	//숫자가 순서대로 있는지 확인
	public static boolean isOrder(int[] num) {
		for (int i = 0; i < 4; i++) {
			if (num[i] < num[i + 1]) continue;
			else return false;
		}
		return true;

	}
}
