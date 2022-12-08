

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class B1141_접두사 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 단어의 개수
		int ans = 0;
		ArrayList<String> list =  new ArrayList<>();

		// 입력받기
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}

		// 길이 순으로 정렬하기
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

		//기준이 되는 단어 선택
		for (int i = 0; i < n; i++) {
			boolean check = false;
			//비교할 단어 선택
			for (int j = i + 1; j < n; j++) {
				if (list.get(j).startsWith(list.get(i))) {
					check = true;
					break;
				}
			}
			if (!check) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
