import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon1932 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        int[][] tree= new int[t+1][t+1];
        int[][] dp= new int[t+1][t+1];

        for(int i=1;i<=t;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int j= 1;
            while(st.hasMoreTokens()){
                tree[i][j]= Integer.parseInt(st.nextToken());
                j+=1;
            }
        }

        dp[1][1]= tree[1][1];
        int ans= dp[1][1];
        for(int i=1;i<t;i++) {
            for (int j=1; j<=i; j++){
                dp[i+1][j]= Math.max(tree[i+1][j]+ dp[i][j],dp[i+1][j]);
                dp[i+1][j+1]= Math.max(tree[i+1][j+1]+ dp[i][j],dp[i+1][j+1]);

                ans= Math.max(ans,Math.max(dp[i+1][j],dp[i+1][j+1]));
            }

        }

        System.out.println(ans);
    }
}
