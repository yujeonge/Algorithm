

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1247_부호 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 3개의 테스트 셋
		for (int i = 0; i < 3; i++) {
			int n = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			// n개의 정수
			for (int j = 0; j < n; j++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			// 0과 비교해서 부호알아내기
			if (sum.compareTo(BigInteger.ZERO) == -1) {
				sb.append('-').append('\n');
			} else if (sum.compareTo(BigInteger.ZERO) == 1) {
				sb.append('+').append('\n');
			} else {
				sb.append('0').append('\n');
			}
		}
		System.out.println(sb);
	}
}
