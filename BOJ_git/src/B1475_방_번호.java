package algo;

import java.util.Scanner;

public class B1475_��_��ȣ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = Integer.MIN_VALUE;
		int[] arr = new int[10];
		
		//�� ��ȣ�� 0�̸� 1�����ϰ� ����
		if (n == 0) {
			System.out.println(1);
			return;
		}

		//�� ��ȣ�� �ڸ������� arr�� ++ �����ֱ�
		while (true) {
			int i = n % 10;
			n = n / 10;
			arr[i]++;
			if (n < 10) {
				arr[n]++;
				break;
			}
		}
		
		//6�� 9�� ȣȯ�ϸ鼭 ��� ����
		arr[6] += arr[9];
		arr[9] = 0;
		
		//arr[6]�� Ȧ������ ¦������ Ȯ��
		if (arr[6] % 2 != 0) {
			arr[6] = arr[6] / 2 + 1;
		} else {
			arr[6] /= 2;
		}

		//arr�� ���� �� �� ���� ū ����ŭ ���ڼ�Ʈ�� �ʿ�
		for (int i = 0; i < arr.length; i++) {
			ans = Math.max(ans, arr[i]);
		}
		
		//���
		System.out.println(ans);
	}
}
