

import java.util.Scanner;

public class B5597_과제_안_내신_분 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		int[] arr = new int[31];
		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			arr[num] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] == 0) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb);
	}
}
