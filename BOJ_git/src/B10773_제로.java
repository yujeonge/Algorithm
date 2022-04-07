

import java.util.Scanner;
import java.util.Stack;

public class B10773_제로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long sum = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < k; i++) {
			int n = sc.nextInt();
			if (n == 0) { // n이 0일 경우
				stack.pop(); // 있는 수 빼기
			} else { // 0이 아니면 stack에 넣기
				stack.push(n);
			}
		}

		while (!stack.isEmpty()) {
			sum += stack.pop();
		}

		System.out.println(sum);
	}
}