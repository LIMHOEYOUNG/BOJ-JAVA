import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11053 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] num= new int[n+1];

        for(int i=1;i<=n;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        int[] dp= new int[n+1];
        int ans= 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(num[i]>num[j]){
                    dp[i]= Math.max(dp[i],dp[j]+1);
                }
            }

            ans= Math.max(dp[i],ans);
        }

        System.out.println((ans+1));
    }
}
