package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1032_���_������Ʈ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		char[] ch = br.readLine().toCharArray();

		// tc��ŭ �ݺ�
		for (int i = 1; i < n; i++) {
			String str = br.readLine();
			// ���ڿ� ���̸�ŭ �ݺ�
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] != str.charAt(j)) {
					ch[j] = '?';
				}
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
