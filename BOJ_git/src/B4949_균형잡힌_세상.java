

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949_균형잡힌_세상 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		String str = br.readLine(); // str입력받기

		while (!str.equals(".")) { // 입력 종료 조건

			Loop: for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i); // 한글자씩 따져보면서

				switch (ch) {
				case '(':
					stack.push(ch);
					break;
				case ')':
					if (stack.isEmpty()) { //비어있으면
						stack.push(ch); /// stack에 안넣으면 str=(((일때 yes뜸
						break Loop; //더 볼 것도 없음
					} else if (stack.peek() == '(') { // 직전 값이 (이면
						stack.pop(); // (꺼내기
					} else {
						stack.push(ch); // [이면
						break Loop; //더 볼 것도 없음
					}
					break;
				case '[':
					stack.push(ch);
					break;
				case ']':
					if (stack.isEmpty()) {
						stack.push(ch);
						break Loop;
					} else if (stack.peek() == '[') {
						stack.pop();
					} else {
						stack.push(ch);
						break Loop; //더 볼 것도 없음
					}
					break;
				}
			} // for문

			if (stack.isEmpty()) sb.append("yes").append('\n');
			else sb.append("no").append('\n');
			stack.clear(); // stack비워주기
			str = br.readLine(); // 다음 문자열 받기
		} // while문
		System.out.println(sb);
	}
}
