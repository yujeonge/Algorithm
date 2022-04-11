

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966_프린터_큐 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Queue<Integer> queue = new LinkedList<>();

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 문서의 개수
			int M = Integer.parseInt(st.nextToken()); // 문서가 현재 Queue에서 몇 번째에 놓여 있는지

			// queue에 집어넣기
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				queue.add(Integer.parseInt(st.nextToken()));
			}

			int importance = 9;
			int order = 1;
			while (importance > 0) {
				// 해당 중요도가 큐에 들어있을 때
				if (queue.contains(importance)) {
					// 해당하는 인덱스의 수가 맨 앞, 중요도가 가장 높음
					if (M == 0 && queue.peek() == importance) {
						sb.append(order).append('\n');
						break;
					}
					// 해당 인덱스의 수가 맨 앞, 중요도는 가장 높지 않음
					else if (M == 0 && queue.peek() != importance) {
						// 위치 초기화
						M = (queue.size() - 1);
						queue.add(queue.poll());
					}
					// 해당 인덱스의 수가 맨 앞이 아니고, 중요도는 가장 높을 때
					else if (M != 0 && queue.peek() == importance) {
						queue.poll();
						// 해당 인덱스 위치 저장
						M--;
						// 순서
						order++;
						continue;
					} else {
						// 중요도가 가장 높은 문서를 앞으로 옮기는 중
						queue.add(queue.poll());
						// 해당 인덱스 위치 저장
						M--;
					}

				} 
				//중요도를 9,8,7,6,,,,으로 낮춰가면서 확인
				else {
					importance--;
				}
			} //while
			
			queue.clear(); //queue비워주기
		} //tc
		
		System.out.println(sb);
	}
}