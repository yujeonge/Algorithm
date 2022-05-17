import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1669_멍멍이_쓰다듬기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); //원숭이 키
		int y = Integer.parseInt(st.nextToken()); //멍멍이 키
		int t = y - x; // 늘려야하는 키
		
		if (t == 0) {  //키 차이가 안나면
			System.out.println(0);
			return;
		}
		
		long n = 0; //t와 일 때 사용할 수 있는 가장 큰 제곱근 수

		while (n * n < t) { //n구하기
			n++;
		}
		
		if (n * n != t) n--;
		
		long ans = 2 * n - 1; //키 크는 과정이 걸리는 일 수
		t -= n * n;

		while (t > 0) { //키 차이가 안날때까지 
			t -= Math.min(n, t); //남은 키 차이 갱신
			ans++;
		}

		System.out.println(ans);
	}
}