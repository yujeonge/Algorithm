

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1755_숫자놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받아들이기 위해
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 문자열을 쪼개기 위해
		StringBuilder sb = new StringBuilder(); // 출력을 위해
		int m = Integer.parseInt(st.nextToken()); // m
		int n = Integer.parseInt(st.nextToken()); // n
		String[] arr = new String[n - m + 1]; // m 이상 n 이하의 정수를 영어로 변환해서 저장할 arr배열
		HashMap<String, Integer> hash = new HashMap<>(); // 영어로 변환한 string과 숫자를 저장할 배열
		String[] eng = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" }; // 0~10까지 숫자를
																											// 영어로 변환해 줄
																											// eng배열
		int index = 0; // index를 체크하기 위한 변수

		// m이상 n이하의 숫자를 영어로 변환하여 arr배열에 저장하기
		for (int i = m; i <= n; i++) {
			String str = ""; // 숫자를 영어로 변환한 string을 저장할 변수
			if (i >= 10) { // 만약 변환할 숫자가 10초과이면
				int t = i / 10; // 10의 자리의 숫자는 t에 저장
				int o = i % 10; // 1의 자리 숫자는 o에 저장
				str = eng[t] + eng[o]; // 10의자리 영어단어+1의 자리 영어단어을 str에 저장
			} else if (i < 10) { // 변환할 숫자가 10이하이면
				str = eng[i]; // 해당 숫자를 영어로 변환해서 str에 저장
			}
			arr[index++] = str; // index를 1씩 증가시키면서 (숫자 순서대로)영어 단어를 arr에 저장
			hash.put(str, i); // hash에 영어단어, 숫자 저장
		}

		Arrays.sort(arr); // 사전순으로 정렬하기

		index = 0; // 한 줄에 10개씩 출력해야하므로 몇번 출력했는지 체크할 변수
		for (int i = 0; i < n - m + 1; i++) { // m이상 n이하까지
			sb.append(hash.get(arr[i])).append(' '); // 사전순으로 hash에서 숫자 찾아서 sb에 더하기
			index++; // 한번 출력할때마다 ++
			if (index == 10) { // 한줄에 10개가 출력 되었다면
				sb.append('\n'); // 개행추가
				index = 0; // 출력한 횟수 초기화
			}
		}

		System.out.println(sb); // 출력하기
	}
}
