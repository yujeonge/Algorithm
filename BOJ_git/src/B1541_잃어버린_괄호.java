

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class B1541_잃어버린_괄호 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ans = Integer.MAX_VALUE; //초기값
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");

		while (st.hasMoreTokens()) {
			int temp = 0;

			// 뺄셈으로 나눈 토큰을 덧셈으로 나눔
			StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

			// 덧셈으로 나눈 토큰들을 전부 더함
			while (st2.hasMoreTokens()) {
				temp += Integer.parseInt(st2.nextToken());
			}

			if (ans == Integer.MAX_VALUE) { //ans가 초기값 -> 첫번째 토큰
				ans = temp; 
			} else {
				ans -= temp;
			}
		}//st while문
		System.out.println(ans);
	}

}