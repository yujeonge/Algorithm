

import java.util.Scanner;

public class B2609_최대공약수와_최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int min = A > B ? B : A; // 최소공배수는 둘 중 작은 숫자부터 시작
		int max = A > B ? A : B; // 최대공약수는 둘 중 큰 숫자부터 시작
		
		//최소공배수 구하기
		while (true) {
			int a = 0;
			int b = 0;

			if (A % min == 0) a++;
			if (B % min == 0) b++;
			if (a == 1 && b == 1) break;
			min--;
		}
		
		//최대공약수 구하기
		while (true) {
			int a = 0;
			int b = 0;

			if (max % A == 0) a++;
			if (max % B == 0) b++;
			if (a == 1 && b == 1) break;
			max++;

		}

		System.out.println(min);
		System.out.println(max);
	}
}
