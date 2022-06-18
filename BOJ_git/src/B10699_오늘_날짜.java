

import java.text.SimpleDateFormat;
import java.util.Date;

public class B10699_오늘_날짜 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		String str = sdf.format(now);
		System.out.println(str);
	}
}
