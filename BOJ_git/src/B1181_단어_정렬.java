

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1181_단어_정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s[] = new String[n]; // 문자열 배열에 데이터 저장

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}

		Arrays.sort(s, new Comparator<String>() { // 문자열 배열 행을 기준으로 정렬

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) { // 두 문자열의 길이가 같은 경우는
					return o1.compareTo(o2); // 사전 순으로 정렬
				} else { // 그 외에는 문자열들의 길이로 비교
					return Integer.compare(o1.length(), o2.length());
				}

			}

		});

		System.out.println(s[0]); // 중복을 고려해 출력하기 위해 첫 번째 문자열은 출력
		for (int i = 1; i < s.length; i++) { // 1번 인덱스부터 이전 인덱스와 비교해 출력하기 때문에 위의 처리는 문제X
			if (s[i - 1].equals(s[i]))
				continue; // 같은 문자열이라면 건너뛰고
			System.out.println(s[i]); // 문자열 출력
		}
	}
}