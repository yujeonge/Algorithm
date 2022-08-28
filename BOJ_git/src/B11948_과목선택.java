package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11948_과목선택 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		int ans = 0;

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		min1 = Math.min(a, Math.min(b, Math.min(c, Math.min(d, min1))));
		min2 = Math.min(e, Math.min(f, min2));

		ans = (a + b + c + d - min1) + (e + f - min2);

		System.out.println(ans);

	}
}
