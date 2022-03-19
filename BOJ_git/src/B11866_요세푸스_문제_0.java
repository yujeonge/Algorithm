

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11866_요세푸스_문제_0 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		//queue에 N까지 넣어줌
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		sb.append("<");
		//queue사이즈가 0이 될 때 까지 돌려줌
		while (!(queue.size() == 0)) {
			//K-1번째까지 원소를 빼고, queue에 다시 넣어줌
			for (int i = 1; i < K; i++) {
				int rem = queue.poll();
				queue.add(rem);
			}
			sb.append(queue.poll()).append(", ");//K번째 원소를 sb에 추가하고, poll함
		}
		sb.setLength(sb.length()-2); //제일 마지막 ", "삭제
		sb.append(">");
		System.out.println(sb);
	}
}