

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B10845_큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		int last = -1;
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			switch (str) {
			case "push":
				int a = sc.nextInt();
				q.add(a);
				last = a;
				break;
			case "pop":
				if (q.isEmpty()) sb.append(-1).append('\n');
				else sb.append(q.poll()).append('\n');	
				break;
			case "size":
				sb.append(q.size()).append('\n');
				break;
			case "empty":
				if(q.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "front":
				if(q.isEmpty()) sb.append(-1).append('\n');
				else sb.append(q.peek()).append('\n');
				break;
			case "back":
				if(q.isEmpty()) sb.append(-1).append('\n');
				else sb.append(last).append('\n');
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}
