

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11723_집합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(br.readLine()); // 연산의 수
		int x = 0;
		boolean[] b = new boolean[21]; // 인덱스 맞추려고
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String str = st.nextToken();
			if(st.hasMoreElements()) { 
				x = Integer.parseInt(st.nextToken());
			}
			switch (str) {
			case "add":
				b[x] = true;
				break;
			case "remove": 
				b[x] = false;
				break;
			case "check": 
				if(b[x] == true) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "toggle": 
				if(b[x] == true) b[x] = false;
				else b[x] = true;
				break;
			case "all": 
				for (int j = 1; j < 21; j++) {
					b[j] = true;
				}
				break;
			case "empty": 
				for (int j = 1; j < 21; j++) {
					b[j] = false;
				}
				break;
			}
		}
		System.out.println(sb);
	}
}
