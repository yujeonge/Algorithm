

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23037_5의_수난 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			int n = (int) str.charAt(i) - '0';
			ans += Math.pow(n, 5);
		}
		System.out.println(ans);
	}
}
