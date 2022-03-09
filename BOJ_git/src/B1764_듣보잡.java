

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1764_듣보잡 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashSet<String> h = new HashSet<>(); // 듣도 못한 사람 이름 배열
		ArrayList<String> list = new ArrayList<>(); // 듣보잡 배열

		int N = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
		int M = Integer.parseInt(st.nextToken()); // 보도 못한 사람

		// 듣 입력받기
		for (int i = 0; i < N; i++) {
			h.add(br.readLine());
		}

		// 보 입력받으면서 듣이랑 중복되는지 check
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			if (h.contains(str)) {
				list.add(str);
			}
		}

		// 사전 순 정렬
		Collections.sort(list);

		// 출력
		sb.append(list.size()).append('\n');
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append('\n');
		}
		System.out.println(sb);
	}
}
