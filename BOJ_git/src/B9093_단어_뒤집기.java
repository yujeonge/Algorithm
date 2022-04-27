

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B9093_단어_뒤집기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<>();
		int tc = Integer.parseInt(br.readLine()); // 테케

		// 테케만큼 반복
		for (int i = 0; i < tc; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			while (st.hasMoreTokens()) {
				String str = st.nextToken();
				//스택에 집어넣기
				for (int j = 0; j < str.length(); j++) {
					s.push(str.charAt(j));
				}
				//집어 넣은 단어들 빼기
				for (int j = 0; j < str.length(); j++) {
					sb.append(s.pop());
				}sb.append(' ');
			}
			
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
