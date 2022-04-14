

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2805_나무_자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //나무의 수
		int M = Integer.parseInt(st.nextToken()); //필요한 나무의 길이
		long []tree = new long [N];
		long start = 0;
		long end = 0;
		long ans =0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			end = Math.max(end, tree[i]); //나무 길이의 최댓값 구하기
		}
		
		while(start<=end) {
			long mid = (start+end)/2;
			long sum = 0; // 잘린 나무의 총 길이
			for (int i = 0; i < N; i++) {
				if(tree[i]>mid) sum += tree[i]-mid;
			}
			if(sum > M) {
				start = mid +1;
				ans = mid;
			}else if(sum < M) end = mid -1;
			else {
				ans = mid;
				break;
			}
		}
		
		System.out.println(ans);
		
	}
}
