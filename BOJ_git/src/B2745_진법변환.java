

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745_진법변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int ans = 0;
		int index = 0;
		for (int i = N.length() - 1; i >= 0; i--) {
			int temp = N.charAt(i);
			
			if (temp >= 'A') { //입력값이 알파벳이면
				temp += -'A' + 10; //10부터 시작
			}else { //숫자면
				temp -= '0'; //0부터 시작
			}
			
			ans += temp * Math.pow(B, index++); //진법수 구하기
		}
		System.out.println(ans);

	}
}
