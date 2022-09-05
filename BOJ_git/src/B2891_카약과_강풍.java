package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2891_ī���_��ǳ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // ���� ��
		int s = Integer.parseInt(st.nextToken()); // ī���� �ջ�� ���� ��
		int r = Integer.parseInt(st.nextToken()); // ī���� �ϳ� �� ������ ���� ��
		boolean[] arr = new boolean[n + 1]; // �ε����� ���߱� ����
		int ans = 0;

		Arrays.fill(arr, true); // ���� ��⸦ �� �� �ִٰ� ����

		// ī���� �ջ�� ���� false��
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < s; i++) {
			arr[Integer.parseInt(st.nextToken())] = false;
		}

		// ī���� ���� �� ��
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < r; i++) {
			int team = Integer.parseInt(st.nextToken());
			if (arr[team] == false) { // ���� ���� ī���� �μ����ٸ�
				arr[team] = true;
				continue; // �ٸ� ������ �� ������
			} else if (team - 1 > 0 && arr[team - 1] == false) { // ������ ī���� �μ����ٸ�
				arr[team - 1] = true;
				continue;// �� �̻� �� ������
			} else if (team + 1 < n + 1 && arr[team + 1] == false) { // ������ ī���� �μ����ٸ�
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
