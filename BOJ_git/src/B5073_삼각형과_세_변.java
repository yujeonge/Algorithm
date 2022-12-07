package algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B5073_삼각형과_세_변 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			int[] arr = new int[3];
			
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();

			Arrays.sort(arr);

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				System.out.println(sb);
				return;
			}

			if (arr[2] >= arr[0] + arr[1]) {
				sb.append("Invalid").append('\n');
			} else if (arr[0] == arr[1] && arr[1] == arr[2]) {
				sb.append("Equilateral").append('\n');
			} else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
				sb.append("Isosceles").append('\n');
			} else {
				sb.append("Scalene").append('\n');
			}
		}
	}
}
