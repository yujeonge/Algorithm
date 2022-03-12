

import java.util.Scanner;

public class B1592_영식이와_친구들 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사람 수
		int M = sc.nextInt(); // M번 공을 받으면 게임 끝
		int L = sc.nextInt(); // 다음 공을 던질 사람
		int[] arr = new int[N + 1]; // 사람 수 랑 인덱스 맞추기 위해

		arr[1] += 1; // 젤 처음 1번한테 공을 줌

		int ni = 1; // 공을 가지고 있는 사람
		int cnt = 0; // 공 던진 횟수

		while (true) {
			// 던진횟수가 되면 break(M=1때문에 맨 위에도 넣음)
			if (arr[ni] >= M)
				break;

			// 다음에 공 던질 사람 찾기
			// 1.공 가지고 있는 횟수가 홀 수 일 떄
			if (arr[ni] % 2 != 0) {
				ni += L; // 다음 공을 받을 사람 -> 시계방향으로 +L

				if (ni > N) // 범위를 넘어가면
					ni -= N; // 범위 다시
				if (ni <= 0) // 범위를 넘어가면
					ni += N; // 범위 다시

				arr[ni] += 1; // 공받은 횟수+1
				cnt++; // 공던진 횟수

				if (arr[ni] >= M)
					break;
			}

			// 2.공 가지고 있는 횟수가 짝 수 일 때
			if (arr[ni] % 2 == 0) {
				ni -= L;

				if (ni <= 0) // -라서 음 수일때만 생각 하면 됨
					ni += N;

				arr[ni] += 1;
				cnt++;

				if (arr[ni] >= M)
					break;
			}

		}
		System.out.println(cnt);
	}
}
