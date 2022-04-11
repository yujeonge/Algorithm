
import java.util.Scanner;

public class B1110_더하기_사이클 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean isNotSame = true;
		int cycle = 0;
		int C = N;
		do {
			C = (C % 10 * 10) + ((C / 10 + C % 10) % 10); // 60+8
			cycle++;
			if (C == N) {
				isNotSame = false;
			}
		} while (isNotSame);

		System.out.println(cycle);
	}
}
