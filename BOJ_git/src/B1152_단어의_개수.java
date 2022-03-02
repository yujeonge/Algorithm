

import java.util.Scanner;

public class B1152_단어의_개수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine().trim();
		if (N.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(N.split(" ").length);
		}
	}

}
