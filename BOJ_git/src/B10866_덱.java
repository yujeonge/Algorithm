

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class B10866_덱 {
	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tc; i++) {
			String str = sc.next();
			switch (str) {
			case "push_front":
				d.addFirst(sc.nextInt());
				break;
			case "push_back":
				d.addLast(sc.nextInt());
				break;
			case "pop_front":
				if (d.isEmpty()) sb.append(-1).append('\n');
				else sb.append(d.pollFirst()).append('\n');
				break;
			case "pop_back":
				if (d.isEmpty()) sb.append(-1).append('\n');
				else sb.append(d.pollLast()).append('\n');
				break;
			case "size":
				sb.append(d.size()).append('\n');
				break;
			case "empty":
				if(d.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "front":
				if(d.isEmpty()) sb.append(-1).append('\n');
				else sb.append(d.peekFirst()).append('\n');
				break;
			case "back":
				if(d.isEmpty()) sb.append(-1).append('\n');
				else sb.append(d.peekLast()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}
}
