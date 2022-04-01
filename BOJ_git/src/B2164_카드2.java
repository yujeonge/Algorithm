

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164_카드2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		for (int i = 1; i < N; i++) {
			q.poll(); //제일 위 카드 버리기 
			int a = q.poll(); //제일 위 카드 저장, 버리기
			q.add(a); //저장한 값 다시 큐에 넣기
			
		}
		System.out.println(q.poll());
	}
}
