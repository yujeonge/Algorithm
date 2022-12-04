import java.util.*;
 
 
public class B13866_팀_나누기 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int[] team = new int [4];
            
        team[0] = a;
        team[1] = b;
        team[2] = c;
        team[3] = d;
        
        int sum = a+b+c+d; //41
        int min = 10000;
        for (int i=0; i<4; i++){
            for(int j=i+1; j<4; j++){
                int gap = 0;
                int temp_team1 = 0;
                int temp_team2 = 0;
                temp_team1 = team[i] + team[j]; //11
                temp_team2 = sum - temp_team1; //30 
                if (temp_team1<temp_team2) {
                    gap = temp_team2 - temp_team1; //19
                }else {
                    gap = temp_team1 - temp_team2; 
                }
                min = Math.min(min, gap);
            }
        }
        System.out.print(min);
    }
