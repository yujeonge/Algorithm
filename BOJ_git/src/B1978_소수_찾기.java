

import java.util.Scanner;

public class B1978_소수_찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt(); // 수 입력받기
			if (num == 1) { // 1이면 소수가 아님
				continue;
			} else {
				int temp = 0;
				for (int j = 1; j <= num; j++) {
					if (num % j == 0) { //j의 약수이면 temp++
						temp++;
					}
				}
				if (temp == 2) { //1,num만 num의 약수이면
					ans++;
				}
			}

		}
		System.out.println(ans);
	}
}
