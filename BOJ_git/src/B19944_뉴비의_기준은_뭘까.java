

import java.util.Scanner;

public class B19944_뉴비의_기준은_뭘까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		String str = "";
		if (N <= 2) {
			str = "NEWBIE!";
		} else if (2 < N && N <= M) {
			str = "OLDBIE!";
		} else {
			str = "TLE!";
		}
		System.out.println(str);
	}
}
