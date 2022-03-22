

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/* 백준에 hash 왜안돼?*/
public class B10867_중복_빼고_정렬하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.parseInt(st.nextToken()));

		// 입력
		while (st.hasMoreElements()) {
			int n = Integer.parseInt(st.nextToken());
			// 중복이 업으면 list에 추가
			 for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == n) //list에 이미 값이 있으면
					break;
				if (i == list.size() - 1) { //마지막까지 n값이 없으면
					list.add(n); //추가
				}
			}
		}

		// 정렬
		Collections.sort(list);

		// 출력
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(' ');
		}
		System.out.println(sb);
	}
}
