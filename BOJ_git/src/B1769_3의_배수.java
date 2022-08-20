package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1769_3의_배수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();

		int cnt = 0; // 변환 과정을 거친 횟수

		while (true) {
			long sum = 0;
			
			// x가 한자리일 경우 변환 과정 종료
			if (x.length() == 1) { 
				break;
			}
			
			// 각 자리를 모두 더함
			for (int i = 0; i < x.length(); i++) { 
				sum += Integer.parseInt(String.valueOf(x.charAt(i)));
			}
			cnt++;
			x = String.valueOf(sum); // 변환 결과를 x에 넣어줌
		}

		// 변환 결과가 3의 배수인지 판단
		if (Integer.parseInt(String.valueOf(x)) % 3 == 0) { 
			System.out.println(cnt);
			System.out.println("YES");
		} else {
			System.out.println(cnt);
			System.out.println("NO");
		}
	}
}
