package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B26040_특정_대문자를_소문자로_바꾸기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = st.countTokens();
		
		for (int i = 0; i < n; i++) {
			char ch = st.nextToken().charAt(0);
			str = str.replace(ch,(char) (ch+32));
		}
		
		System.out.println(str);
	}
}


