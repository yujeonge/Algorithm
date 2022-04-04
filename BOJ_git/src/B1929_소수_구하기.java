import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929_소수_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[n + 1]; // false면 소수, true면 소수가 아님

		arr[1] = true; // 1은 소수가 아님

		// 2부터 ~ N까지 증가하는 i 를 제외한 i 의 배수를 true처리하면서
		// N까지 도달했을때 남은 수가 소수
		for (int i = 2; i <= n; i++) {
			for (int j = 2; i * j <= n; j++) {
				arr[i * j] = true;
			}
		}

		for (int i = m; i <= n; i++) {
			if (!arr[i]) {
				sb.append(i).append('\n');
			}
		}

		System.out.println(sb);

	}

}