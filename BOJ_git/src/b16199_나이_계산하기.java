package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b16199_����_����ϱ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �¾ ��
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int d1 = Integer.parseInt(st.nextToken());
		// �ش� ��¥
		st = new StringTokenizer(br.readLine());
		int y2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int d2 = Integer.parseInt(st.nextToken());
		// �� ����
		int age = y2 - y1;

		// ������ ���� ���, ������ �ٸ��� ���� ���� �ٸ� ��� �� ������ �ɰ� ���
		if (y1 == y2) {
			System.out.println(age);
		} else {
			if (m1 > m2) {
				System.out.println(age - 1);
			} else if (m1 == m2) {
				if (d1 <= d2) {
					System.out.println(age);
				} else {
					System.out.println(age - 1);
				}
			} else {
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.println(age);
	}

}