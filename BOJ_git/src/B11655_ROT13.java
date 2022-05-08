

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11655_ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] ch = br.readLine().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122 || ch[i] >= 65 && ch[i] <= 90) { //알파벳이면
				int n = (int) ch[i] + 13;
				if (n > 90 && n < 104) n = n - 90 + 64;
				else if (n > 122) n = n - 122 + 96;
				
				sb.append((char)n);
			}else sb.append(ch[i]); //알파벳이 아니면 그대로 출력
			
		}
		System.out.println(sb);
	}
}
