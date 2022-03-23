

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920_수_찾기 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();

	        int n = Integer.parseInt(br.readLine());
	        int[] a = new int[n];
	        StringTokenizer stN = new StringTokenizer(br.readLine());
	        for (int i = 0; i < n; i++) {
	            a[i] = Integer.parseInt(stN.nextToken());
	        }
	        // 이분탐색을 하기위해 오름차순으로 정렬하기
	        Arrays.sort(a);

	        int m = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine()," ");

	        for (int i = 0; i < m; i++) {
	            // 이분 탐색
	            int index = Arrays.binarySearch(a, Integer.parseInt(st.nextToken()));
	            // 배열 a에서 키 값이 st인 요소를 검색 , 요소가 없으면 음수반환, 있으면 index반환
	            if (index < 0) sb.append(0);
	            else sb.append(1);
	            sb.append("\n");
	        }

	        System.out.println(sb);
	    }
	}