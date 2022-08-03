package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3447_버그왕 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String str2 = "";
		
		//입력이 null일때까지 반복
		while (str != null) {
			
			str2 = str;
			
			while (true) {
				str = str.replace("BUG", ""); //BUG가 있으면 없애주기
				if (str2 == str) break; //str2와 str이 같으면 str에 BUG가 없는 것
				else str2 = str; //BUG가 있었다면 str2와 str을 같게 만듦
			}
			System.out.println(str);
			str = br.readLine(); //str 새로 입력받기
		}
	}
}
