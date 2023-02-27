package BOJ;

import java.util.Scanner;

public class B2953_나는_요리사다 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int score = 0; 

		for (int i = 1; i < 6; i++) {
			int temp = 0;
			for (int j = 0; j < 4; j++) {
				temp += sc.nextInt();
			}
			score = Math.max(score, temp);

			if (score == temp) {
				ans = i;
			}
		}

		System.out.println(ans + " " + score);
	}
}
