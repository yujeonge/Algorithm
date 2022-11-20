package algo;

import java.util.Scanner;

public class B11549_Identifying_tea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[5];
	
		for (int i = 0; i < 5; i++) {
			arr[sc.nextInt()]++;
		}
		System.out.println(arr[t]);
	}
}
