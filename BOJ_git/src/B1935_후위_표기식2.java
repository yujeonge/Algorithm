

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class B1935_후위_표기식2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Double> stack = new Stack<>();
		HashMap<Character, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine()); // 피연산자의 개수
		String str = br.readLine(); //계산해야하는 후위 표기식
		
		//피연산자에 대응하는 값들 hashmap에 넣기
		char ch = 'A';
		for (int i = 0; i < n; i++) {
			map.put(ch, Integer.parseInt(br.readLine()));
			ch++;
		}

		//후위계산하기
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z') //ch가 A~Z라면 
				stack.push((double) map.get(ch)); //해당 ch에 대응하는 값 stack에 넣기
			else { //연산자이면
				double b = stack.pop();
				double a = stack.pop();

				switch (ch) {
				case '+':
					double d = a + b;
					stack.push(d);
					break;
				case '-':
					d = a - b;
					stack.push(d);
					break;
				case '*':
					d = a * b;
					stack.push(d);
					break;
				case '/':
					d = a / b;
					stack.push(d);
					break;
				}

			}
		}
		//마지막 연산값이 stack에 남아있음
		System.out.printf("%.2f",stack.pop());
	}
}