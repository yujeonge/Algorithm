package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		BigInteger big = new BigInteger("0");
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				big = big.add(new BigInteger("2").pow(str.length()-(i+1)));
			}else if(str.charAt(i) == '0') {
				big = big.add(new BigInteger("0"));
			}else if(str.equals("0")) {
				sb.append("0");
			}
		}
		
		BigInteger ans = big.multiply(new BigInteger("17"));
		String last = "";
		while(ans != BigInteger.valueOf(0)) {
			last += ans.mod(BigInteger.valueOf(2));
			ans = ans.divide(BigInteger.valueOf(2));
		}
		
		for (int i = last.length()-1; i >=0 ; i--) {
			sb.append(String.valueOf(last.charAt(i)));
			
		}
		System.out.println(sb);
		br.close();
	}
}
