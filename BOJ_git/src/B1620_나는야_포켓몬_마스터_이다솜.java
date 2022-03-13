

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B1620_나는야_포켓몬_마스터_이다솜 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		Map<String, String> dogam = new HashMap<>();

		int N = Integer.parseInt(st.nextToken()); // 도감에 수록된 포켓몬의 수
		int M = Integer.parseInt(st.nextToken()); // 맞춰야하는 문제 갯수
		
		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			dogam.put(str, String.valueOf(i));
			dogam.put(String.valueOf(i), str);
		}

		for (int i = 0; i < M; i++) {
			sb.append(dogam.get(br.readLine())).append("\n");

		}
		System.out.println(sb);
	}
}