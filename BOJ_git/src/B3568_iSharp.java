

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B3568_iSharp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ", ");
		StringBuilder sb = new StringBuilder();
		ArrayList<String> list = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		
		//추가 변수형들만 변형
		for (int i = 1; i < list.size(); i++) {
			char []ch = list.get(i).toCharArray();
			ArrayList<Character> var = new ArrayList<>(); //기본 변수명을 저장할 var
			
			sb.append(list.get(0)); //기본변수형 추가
			for (int j = ch.length - 1; j >= 0; j--) {
				
				if(ch[j] == '[') continue; 
				else if(ch[j] == ']') sb.append("[]");
				else if(ch[j] == ';') continue;
				else if(ch[j] == '*') sb.append('*');
				else if(ch[j] == '&') sb.append('&');
				else var.add(ch[j]);
			}
			sb.append(' ');
			
			//기본 변수명 출력
			for (int j = var.size()-1; j >= 0; j--) {
				sb.append(var.get(j));
			}
			sb.append(";\n");
		}
		
		System.out.println(sb);
	}
}
