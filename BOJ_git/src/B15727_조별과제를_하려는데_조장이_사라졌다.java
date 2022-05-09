

import java.util.Scanner;

public class B15727_조별과제를_하려는데_조장이_사라졌다 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int ans = l / 5;
		if(l % 5 != 0) ans++;
		System.out.println(ans);
	}
}
