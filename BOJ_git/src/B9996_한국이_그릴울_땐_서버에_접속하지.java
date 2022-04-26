

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9996_한국이_그릴울_땐_서버에_접속하지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); //파일 갯수
		StringTokenizer st = new StringTokenizer(br.readLine(), "*"); // 패턴 *기준으로 나누기
		String p1 = st.nextToken(); // *앞쪽 패턴
		String p2 = st.nextToken(); // *뒷쪽 패턴
		
		//파일 갯수만큼 반복
		for (int i = 0; i < N; i++) {
			String str = br.readLine(); // 파일 이름
			if (p1.length() + p2.length() > str.length()) { //패턴문자열보다 파일 이름의 길이가 짧으면 NE
				sb.append("NE").append('\n');
				continue;
			}
			String s1 = str.substring(0, p1.length()); // 파일이름 앞부분
			String s2 = str.substring(str.length() - p2.length(), str.length()); // 파일이름 뒷부분

			if (p1.equals(s1) && p2.equals(s2)) sb.append("DA").append('\n'); //같으면 DA
			else sb.append("NE").append('\n');
		}
		System.out.println(sb);
	}
}