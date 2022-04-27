

import java.util.Scanner;

public class B17496_스타_후르츠 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //여름일수
		int T = sc.nextInt(); //스타후르츠가 성장하는 일 수 
		int C = sc.nextInt(); //스타후르츠를 심을 수 있는 칸
		int P = sc.nextInt(); //스타후르츠 가격

		int cnt = 0;
		int day = 1 + T;

		while (day <= N) {
			cnt += C;
			day += T;
		}
		System.out.println(cnt * P);
	}
}