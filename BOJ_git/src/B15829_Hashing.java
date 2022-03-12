

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Math.pow하니까 시간초과 뜸, 
pow = pow * 31 % 1234567891 보다 따로하는게 빠름! */

public class B15829_Hashing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		char[] ch = br.readLine().toCharArray();
		long H = 0;
		long pow = 1;
		for (int i = 0; i < L; i++) {
			H += (ch[i] - 'a' + 1) * pow;
			pow *= 31;
			pow %= 1234567891;
		}
		System.out.println(H %= 1234567891);
	}
}
