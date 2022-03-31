

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B10816_숫자_카드2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 1; i <= N; i++) {
			int n =Integer.parseInt(st.nextToken());
			if(map.containsKey(n)) { //map에 key값으로 n이 있었다면(이전에 n카드가 나왔었다면)
				int ni = map.get(n)+1; //key의 value값에 +1한 값을
				map.replace(n, ni); //해당 key에 넣어줌
			}else map.put(n, 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < M; i++) {
			int m = Integer.parseInt(st.nextToken());
			if(map.containsKey(m)==true) sb.append(map.get(m)).append(" "); //key값이 있다면 
			else sb.append(0).append(" "); //앖다면
		}
		
		System.out.println(sb);
	}
		
}

