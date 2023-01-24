package BOJ;

import java.util.Scanner;

public class B6841_I_Speak_TXTMSG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = sc.nextLine();
			if (str.equals("CU")) {
				sb.append("see you").append('\n');
			} else if (str.equals(":-)")) {
				sb.append("I’m happy").append('\n');
			} else if (str.equals(":-(")) {
				sb.append("I’m unhappy").append('\n');
			} else if (str.equals(";-)")) {
				sb.append("wink").append('\n');
			} else if (str.equals(":-P")) {
				sb.append("stick out my tongue").append('\n');
			} else if (str.equals("(~.~)")) {
				sb.append("sleepy").append('\n');
			} else if (str.equals("TA")) {
				sb.append("totally awesome").append('\n');
			} else if (str.equals("CCC")) {
				sb.append("Canadian Computing Competition").append('\n');
			} else if (str.equals("CUZ")) {
				sb.append("because").append('\n');
			} else if (str.equals("TY")) {
				sb.append("thank-you").append('\n');
			} else if (str.equals("YW")) {
				sb.append("you’re welcome").append('\n');
			} else if (str.equals("TTYL")) {
				sb.append("talk to you later").append('\n');
				break;
			} else if (str.equals("LOL")) {
				sb.append("laughing out loud").append('\n');
			} else {
				sb.append(str).append('\n');
			}
		}
		System.out.println(sb);
	}
}
