

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1074_Z {
	static int count = 0; //몇번의 방문을 했는지 더하는 변수

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int r = Integer.parseInt(st.nextToken()); //행
		int c = Integer.parseInt(st.nextToken()); //열
		int size = (int) Math.pow(2, N); //한 변의 사이즈 구하기(2^N)
		
		find(size, r, c);
		System.out.println(count);
	}

	private static void find(int size, int r, int c) {
		//배열을 더 분할 할 수 없으면 main으로
		if(size == 1)
			return;
		
		//배열을 4사분면으로 계속 나눠서 생각
		//1사분면에 속한다면
		if(r < size/2 && c < size/2) {
			find(size/2, r, c); 
		}
		//2사분면에 속한다면
		else if(r < size/2 && c >= size/2) {
			count += size * size / 4; //앞에서 1사분면을 방문했으므로 count에 방문 횟수를 더해줌
			find(size/2, r, c - size/2);
		}
		//3사분면
		else if(r >= size/2 && c < size/2) {
			count += (size * size / 4) * 2; 
			find(size/2, r - size/2, c);
		}
		//4사분면
		else {
			count += (size * size / 4) * 3;
			find(size/2, r - size/2, c - size/2);
		}
	}
}