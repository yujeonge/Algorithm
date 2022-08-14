package algo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2083_럭비_클럽 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		do {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			if (name.equals("#"))
				break;
			else {
				int age = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());

				sb.append(name).append(' ');

				if (age > 17 || weight >= 80) {
					sb.append("Senior").append('\n');
				}else {
					sb.append("Junior").append('\n');
				}
			}

		} while (true);
		
		System.out.println(sb);

	}
}
