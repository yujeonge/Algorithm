package BOJ;

import java.util.*;
import java.io.*;

public class B1380_귀걸이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int sce = 0;

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			} else {
				sce++;
			}

			String[] g = new String[n];
			for (int i = 0; i < n; i++) {
				g[i] = br.readLine();
			}

			ArrayList<Integer> isNum = new ArrayList<Integer>();

			for (int i = 0; i < n * 2 - 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken()) - 1;

				if (isNum.contains(num)) {
					isNum.remove((Integer) num);
				} else {
					isNum.add(num);
				}
			}

			sb.append(sce).append(' ').append(g[isNum.get(0)]).append('\n');
		}
		System.out.println(sb);
	}

}