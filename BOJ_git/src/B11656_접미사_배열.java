

import java.util.Arrays;
import java.util.Scanner;

public class B11656_접미사_배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next(); //문자열 s
		String temp = ""; //접미사를 나타낼 임시 변수 temp
		char[] c = str.toCharArray(); 
		String[] s = new String[str.length()]; //사전순 출력을 위해 접미사들을 배열s에 넣음

		//접미사를 배열 s에 넣기
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = c[i] + temp; //n, on, oon ,,,순으로 
			s[i] = temp; //s배열에 넣기
		}

		Arrays.sort(s); //정렬하기

		//출력
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]).append('\n');
		}

		System.out.println(sb); 
	}
}
