

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
/*
 * ArrayList보다 메모리는 조금 큰데 시간은 조금 빠름
 * 
 */
public class B2571_수_정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> list = new LinkedList<Integer>();
		// 입력받기
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		// 정렬
		Collections.sort(list);
		// 출력
		for (int i = 0; i < N; i++) {
			sb.append(list.poll()).append('\n');
		}
		System.out.println(sb);
	}
}