

import java.util.Scanner;

public class B2231_분해합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 1; //N은 1 이상
		int ans = 0; //결과값
		
		while (num < N) {
			int temp = num; //자기자신 저장
			int num2 = num; //각 자릿수를 저장할 변수

			//각 자릿수 더하기
			while (num2 != 0) { 
				temp += num2 % 10;
				num2 /= 10;
			}
			
			//N과 같으면 생성자, 가장 작은 값 출력
			if (temp == N) {
				ans = num;
				break;
			}
			
			num++;
		}//while문
		
		System.out.println(ans);
	}
}
