package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2755_이번_학기_평점은_몇점 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		double ans = 0;
		double totalCredit = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			totalCredit += credit;
			String grade = st.nextToken();

			if (grade.equals("A+")) {
				ans += credit * 4.3;
			} else if (grade.equals("A0")) {
				ans += credit * 4.0;
			} else if (grade.equals("A-")) {
				ans += credit * 3.7;
			} else if (grade.equals("B+")) {
				ans += credit * 3.3;
			} else if (grade.equals("B0")) {
				ans += credit * 3.0;
			} else if (grade.equals("B-")) {
				ans += credit * 2.7;
			} else if (grade.equals("C+")) {
				ans += credit * 2.3;
			} else if (grade.equals("C0")) {
				ans += credit * 2.0;
			} else if (grade.equals("C-")) {
				ans += credit * 1.7;
			} else if (grade.equals("D+")) {
				ans += credit * 1.3;
			} else if (grade.equals("D0")) {
				ans += credit * 1.0;
			} else if (grade.equals("D-")) {
				ans += credit * 0.7;
			}
		}
		ans /= totalCredit;
		System.out.println(String.format("%.2f", ans));

	}
}
