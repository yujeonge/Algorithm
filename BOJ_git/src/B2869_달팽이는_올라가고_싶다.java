
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869_달팽이는_올라가고_싶다 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken()); //낮에 올라가는 m
		int B = Integer.parseInt(st.nextToken()); //자는 동안 미끄러지는 m 
		int V = Integer.parseInt(st.nextToken()); //올라가야하는 총 m

		int days = (V - B) / (A - B); 

		if ((V - B) % (A - B) != 0) {
			days++;
		}
		System.out.println(days);
	}
}