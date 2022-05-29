

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3613_Java_vs_C {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char[] ch = str.toCharArray();
		
		if (ch[0] == '_' || ch[ch.length - 1] == '_') { //제일 처음,마지막 문자가  _이면
			System.out.println("Error!");
			return;
		}else if( ch[0] >= 'A' && ch[0] <= 'Z') { //제일 처음이 대문자이면
			System.out.println("Error!");
			return;
		}
		sb.append(ch[0]);
		
		if (str.contains("_")) { // C++형식이라면
			for (int i = 1; i < ch.length; i++) {
				if(ch[i] >= 'A' && ch[i] <= 'Z') { //대문자가 있으면
					System.out.println("Error!");
					return;
				}if (ch[i] == '_') { //_ 전후 문자가 소문자 라면
					if (ch[i + 1] <= 'z' && ch[i + 1] >= 'a' && ch[i - 1] <= 'z' && ch[i - 1] >= 'a') {
						continue;
					} else { //_ 전후 문자가 소문자가 아니면
						System.out.println("Error!");
						return;
					}
				} else if (ch[i - 1] == '_') { //_ 다음에 오는 문자면
					sb.append((char) (ch[i] - 32)); //대문자로 출력
				} else {
					sb.append(ch[i]); //중간 문자면 그대로 출력
				}
			}
		} else { // java형식이라면
			for (int i = 1; i < ch.length; i++) {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					sb.append('_');
					sb.append((char) (ch[i] + 32));
				} else {
					sb.append(ch[i]);
				}

			}

		}
		System.out.println(sb);
	}
}
