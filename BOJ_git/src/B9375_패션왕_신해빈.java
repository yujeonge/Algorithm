

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B9375_패션왕_신해빈 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = new HashMap<>();
		int tc = Integer.parseInt(br.readLine());// 테스트 케이스

		// TC만큼 반복
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine()); // 의상의 갯수
			int ans = 1;
			// 의상 입력받기
			for (int j = 0; j < num; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken(); // 의상의 이름
				String type = st.nextToken(); // 의상의 종류
				if (!map.containsKey(type)) map.put(type, 1); // 의상의 종류가 map에 없으면 넣어주기
				else map.replace(type, map.get(type) + 1); // 이미 있는 종류면 해당 종류 갯수+1
			}

			// 의상을 입을 수 있는 경우 출력하기
			for (int val : map.values()) {
				ans *= val + 1; //해당 종류를 입는경우(value값)+입지 않는 경우(1)
			}
			
			sb.append(ans-1).append('\n'); //아무것도 입지 않는 경우(1) 빼기
			map.clear(); //map 비워주기
		}
		System.out.println(sb);
	}
}
