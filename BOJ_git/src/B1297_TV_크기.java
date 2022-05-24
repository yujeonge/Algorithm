

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1297_TV_크기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double D = Double.parseDouble(st.nextToken()); //대각선의 길이
		double H = Double.parseDouble(st.nextToken()); //높이 비율
		double W = Double.parseDouble(st.nextToken()); //너비 비율

		double pow = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		double sqrt = Math.sqrt(pow);

		System.out.println((int) (sqrt * H) + " " + (int) (sqrt * W));
	}

}