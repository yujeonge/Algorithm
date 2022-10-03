import java.util.Scanner;

class B21300_Bottle_Return{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0 ; i < 6; i++){
            sum += sc.nextInt();
        }
        System.out.println(sum*5);
    }
}