package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2890_ī�� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] arr = new int[10];
		int[] ans = new int[10];
		int max = Integer.MIN_VALUE;
		int rank = 1;

		// arr�迭�� �󸶸�ŭ ������ �Է¹ޱ�
		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			arr[0] = 0; // arr[0]�ʱ�ȭ
			for (int j = 1; j < c; j++) {
				if (str.charAt(j) == '.') { // �� ǥ���̸�
					arr[0]++; // arr[0]++
				} else {
					if (str.charAt(j) - '0' > 9) { // �� �����̸� ���� ���� Ȯ��
						continue;
					} else {
						arr[str.charAt(j) - '0'] = arr[0]; // �ش� ���� arr�� arr[0]�� �� �־��ֱ�
						max = Math.max(max, arr[str.charAt(j) - '0']); // ���� �ָ� �� �Ÿ� ���ϱ�
						break;
					}
				}
			}
		}

		// 9���̴ϱ� �ִ� 9�� �ݺ���
		for (int ii = 0; ii < 9; ii++) {

			for (int i = 1; i < 10; i++) {
				if (arr[i] == max) { // max��ŭ �� ���� �������̸�
					ans[i] = rank; // �ش� ���� ���� rank�־��ֱ�
				}
			}
			int temp = max;// max���� �ӽ� ���� temp�� �־��
			max = Integer.MIN_VALUE; // max�ʱ�ȭ

			for (int i = 0; i < 10; i++) {
				if (arr[i] >= temp) { // temp������ ũ�� �̹� ����� ������ ��
					continue;
				} else {
					max = Math.max(max, arr[i]); // �������� �ָ� �� �Ÿ� ���ϱ�
				}
			}
			rank++; // ���� ��� Ȯ��
		}

		// ���
		for (int i = 1; i < 10; i++) {
			System.out.println(ans[i]);
		}
	}
}
