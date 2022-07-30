package algo2;

import java.util.Scanner;

public class B1094_막대기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //원하는 막대의 길이
		
		int stick = 64; //지민이가 가지고 있는 막대의 길이
		int cnt = 0; //풀로 붙이는 횟수
		
		while(x>0) {
			//스틱의 길이가 x보다 크다면 반으로 자르기
			if(stick>x) stick /= 2;
			//스틱의 길이가 x보다 작다면 더하기
			else {
				x -= stick;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
