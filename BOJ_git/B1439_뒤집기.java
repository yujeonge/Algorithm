package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1439_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int zero = 0;
		int one = 0;

		// 첫번째가 0이면 zero++, 1이면 one++
		char c = str.charAt(0);
		if (c == '0') zero++;
		else one++;

		
		for (int i = 1; i < str.length()-1; i++) {
			char ch = str.charAt(i);
			// 앞글자와 같은 숫자이면 세지않는다
			if (c == ch) continue;
			//같지 않으면 해당 숫자 ++
			else if(ch == '0') zero++;
			else one++;
			
			c = ch;
		}
		
		//맨 뒷 글자가 다른 글자이면
		if(str.charAt(str.length() - 2) != str.charAt(str.length() - 1)) {
			//해당 숫자++
			if(str.charAt(str.length() - 1) == '0') zero++;
			else one++;
		
		}

		System.out.println(Math.min(zero, one));
	}
}
