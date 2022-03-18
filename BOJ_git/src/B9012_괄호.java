

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012_괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(br.readLine());
		//tc만큼 반복
		for (int i = 0; i < tc; i++) {
			Stack<Character> stack = new Stack<>(); 
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch == '(') stack.push(ch); //ch가 (면 스택에 넣기
				else { 						// )면
					if (stack.isEmpty()) { //스택이 비어있으면 VPS가 아님
						stack.push(ch); 	//스택에 넣기
						break;
					} else {
						stack.pop(); //스택의 top빼기
					}
				}
			}

			String ans = stack.isEmpty()?"YES":"NO";
			sb.append(ans).append('\n');
		}
		System.out.println(sb);
	} 
}