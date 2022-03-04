
import java.util.Scanner;

public class B11050_이항_계수1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int NK = N-K;
		int Nf = 1;
		int Kf = 1;
		int NKf = 1;
		
		while (N != 0) {
			Nf *= N;
			N--;
		}
		while (K != 0) {
			Kf *= K;
			K--;
		}
		while (NK != 0) {
			NKf *= NK;
			NK--;
		}
		
		int ans = Nf /(Kf*NKf);
		System.out.println(ans);
	}
}
