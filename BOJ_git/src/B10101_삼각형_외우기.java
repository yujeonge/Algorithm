import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10101_삼각형_외우기 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		//세 각의 합이 180이 아니면 Error를 출력
		if((A + B + C) != 180) 
			System.out.println("Error");
			//모든 각이 같으면 각 각의 크기는 60
		}else if(A == B && B == C) {
			System.out.println("Equilateral");
			//두 각이 같을때 조건
		}else if(A == B || B == C || A == C) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
	}

}