

import java.util.Arrays;
import java.util.Scanner;

public class B1417_국회의원_선거 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 후보의 수
		
		if(N == 1) { //후보가 한명이라면
			System.out.println(0); //0명 매수
			return;
		}
		
		int dasom = sc.nextInt(); // 후보 1번을 뽑는 사람의 수
		int[] a = new int[N - 1]; //1번을 제외한 후보를 뽑는 사람의 수를 배열 a에 넣음
		int ans = 0; //매수 해야하는 사람의 수
		
		for (int i = 0; i < N - 1; i++) {
			a[i] = sc.nextInt();
		}
		
		//정렬하기
		Arrays.sort(a);

		//배열의 원소의 최댓값보다 후보 1번을 뽑는 사람이 더 많을 때까지 반복
		while (dasom <= a[N - 2]) {
			dasom++;
			a[N - 2]--;
			ans++;
			Arrays.sort(a);
		}
		
		System.out.println(ans);
	}
}
