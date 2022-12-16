package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class B6840_Who_is_in_the_middle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int[3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
	
		Arrays.sort(arr);

		System.out.println(arr[1]);
	}
}
