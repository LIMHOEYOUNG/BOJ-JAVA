import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14487 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int max= Integer.MIN_VALUE;
        int ans= 0;
        StringTokenizer st= new StringTokenizer(br.readLine());

        while(n-->0){
            int cost= Integer.parseInt(st.nextToken());
            max= Math.max(max,cost);
            ans+=cost;
        }

        System.out.println(ans-max);
    }
}
