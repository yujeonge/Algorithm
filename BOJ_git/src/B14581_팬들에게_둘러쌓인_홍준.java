package algo;

import java.util.Scanner;

public class B14581_ÆÒµé¿¡°Ô_µÑ·¯½×ÀÎ_È«ÁØ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		
		for (int i = 0; i < 3; i++) {
			sb.append(":fan:");
		}
		sb.append('\n');
		sb.append(":fan:").append(":").append(str).append(":").append(":fan:").append('\n');
		for (int i = 0; i < 3; i++) {
			sb.append(":fan:");
		}
		sb.append('\n');
	
		System.out.println(sb);
	}
}
