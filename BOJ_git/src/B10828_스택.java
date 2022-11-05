

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828_스택 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i  < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();

			switch (S) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (!stack.empty())
					sb.append(stack.pop()).append("\n");
				else sb.append(-1).append("\n");
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				if (!stack.empty())
					sb.append(0).append("\n");
				else
					sb.append(1).append("\n");
				break;
			case "top":
				if (!stack.empty())
					sb.append(stack.peek()).append("\n");
				else
					sb.append(-1).append("\n");
				break;
			}

		}
		System.out.println(sb);
	}

}
