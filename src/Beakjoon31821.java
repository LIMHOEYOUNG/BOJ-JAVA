import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31821 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int cost[]=new int[n+1];

        for(int i=1;i<=n;i++){
            cost[i]=Integer.parseInt(br.readLine());
        }

        int m= Integer.parseInt(br.readLine());

        int ans=0;

        for(int i=0;i<m;i++){
            ans+=cost[Integer.parseInt(br.readLine())];
        }

        System.out.println(ans);
    }
}
