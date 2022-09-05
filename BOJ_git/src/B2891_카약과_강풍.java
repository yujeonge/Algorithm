package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2891_카약과_강풍 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 팀의 수
		int s = Integer.parseInt(st.nextToken()); // 카약이 손상된 팀의 수
		int r = Integer.parseInt(st.nextToken()); // 카약을 하나 더 가져온 팀믜 수
		boolean[] arr = new boolean[n + 1]; // 인덱스를 맞추기 위해
		int ans = 0;

		Arrays.fill(arr, true); // 전부 경기를 할 수 있다고 가정

		// 카약이 손상된 팀은 false로
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < s; i++) {
			arr[Integer.parseInt(st.nextToken())] = false;
		}

		// 카약을 가져 온 팀
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < r; i++) {
			int team = Integer.parseInt(st.nextToken());
			if (arr[team] == false) { // 본인 팀의 카약이 부서졌다면
				arr[team] = true;
				continue; // 다른 팀에게 못 빌려줌
			} else if (team - 1 > 0 && arr[team - 1] == false) { // 앞팀의 카약이 부서졌다면
				arr[team - 1] = true;
				continue;// 더 이상 못 빌려줌
			} else if (team + 1 < n + 1 && arr[team + 1] == false) { // 뒷팀의 카약이 부서졌다면
				arr[team + 1] = true;
				continue;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
