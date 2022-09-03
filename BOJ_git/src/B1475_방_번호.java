package algo;

import java.util.Scanner;

public class B1475_방_번호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = Integer.MIN_VALUE;
		int[] arr = new int[10];
		
		//방 번호가 0이면 1리턴하고 종료
		if (n == 0) {
			System.out.println(1);
			return;
		}

		//방 번호의 자릿수마다 arr에 ++ 시켜주기
		while (true) {
			int i = n % 10;
			n = n / 10;
			arr[i]++;
			if (n < 10) {
				arr[n]++;
				break;
			}
		}
		
		//6과 9는 호환하면서 사용 가능
		arr[6] += arr[9];
		arr[9] = 0;
		
		//arr[6]이 홀수인지 짝수인지 확인
		if (arr[6] % 2 != 0) {
			arr[6] = arr[6] / 2 + 1;
		} else {
			arr[6] /= 2;
		}

		//arr의 원소 값 중 가장 큰 수만큼 숫자세트가 필요
		for (int i = 0; i < arr.length; i++) {
			ans = Math.max(ans, arr[i]);
		}
		
		//출력
		System.out.println(ans);
	}
}
