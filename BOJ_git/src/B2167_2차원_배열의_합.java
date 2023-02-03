package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B2167_2차원_배열의_합 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      StringBuilder sb = new StringBuilder();

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(st.nextToken());
         }
      }

      int k = Integer.parseInt(br.readLine());

      for (int i2 = 0; i2 < k; i2++) {
         st = new StringTokenizer(br.readLine());
         int i = Integer.parseInt(st.nextToken());
         int j = Integer.parseInt(st.nextToken());
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         int ans = 0;

         for (int l = i - 1; l < x; l++) {
            for (int l2 = j - 1; l2 < y; l2++) {
               ans += arr[l][l2];
            }
         }

         sb.append(ans).append('\n');
      }

      System.out.println(sb);

   }
}
