package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B20673_Covid_19 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());

		if (q <= 10 && p <= 50) {
			System.out.println("White");
		} else if (q <= 30) {
			System.out.println("Yellow");
		} else {
			System.out.println("Red");

		}
	}
}