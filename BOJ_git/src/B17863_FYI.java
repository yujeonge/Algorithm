package BOJ;

import java.util.Scanner;

public class B17863_FYI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if(!str.substring(0, 3).equals("555")) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
