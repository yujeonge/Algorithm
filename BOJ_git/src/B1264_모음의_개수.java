

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1264_모음의_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		
		while(true) {
			str = br.readLine();
			if(str.equals("#")) {
				break;
			}
			int cnt = 0;
			//모음을 포함하고 있는지 확인
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
						||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					cnt++;
				}
			}
			sb.append(cnt).append('\n');
		} 
		System.out.println(sb);
	}

}
