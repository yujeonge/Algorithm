package algo;

import java.util.Scanner;

public class B2712_미국_스타일 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
           double b = sc.nextDouble();
           String c = sc.next();
           if(c.equals("kg")) {
               System.out.printf("%.4f",b*2.2046);
               System.out.print(" lb\n");
           } else if(c.equals("lb")) {
               System.out.printf("%.4f",b*0.4536);
               System.out.print(" kg\n");
           } else if(c.equals("l")) {
               System.out.printf("%.4f",b*0.2642);
               System.out.print(" g\n");
           } else {
               System.out.printf("%.4f",b*3.7854);
               System.out.print(" l\n");
           }
        }
    }
}