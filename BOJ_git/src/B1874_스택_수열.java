

import java.util.Scanner;
import java.util.Stack;


public class B1874_스택_수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int[] a = new int[N];
		int n = 1; // 1~N까지 스택에 넣기
		int index = 0; // a배열의 index

		// 입력받기
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();

		//
		while (true) {
			//stack이 비어있거나, 제일 위의 값이 a[index]과 같지 않으면
			if (stack.isEmpty() || stack.peek() != a[index]) {
				stack.push(n); //숫자 넣어주기
				sb.append('+').append('\n');
				n++; //다음에 넣을 숫자 1증가
			} else if (stack.peek() == a[index]) { //제일 위의 값이 a[index]과 같으면
				stack.pop(); //숫자 빼기
				sb.append('-').append('\n');
				index++; //배열의 다음 원소 탐색
			}
			if (n > N + 1 || index >= N) break; //범위체크
		}

		if (!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}
		sc.close();
	}
}
