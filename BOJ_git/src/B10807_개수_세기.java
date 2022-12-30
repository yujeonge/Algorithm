

import java.util.HashMap;
import java.util.Scanner;

public class B10807_개수_세기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int num = sc.nextInt();
			map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
		}
		int n = sc.nextInt();
		int ans = map.containsKey(n) ? map.get(v) : 0;
		System.out.println(ans);
	}
}
