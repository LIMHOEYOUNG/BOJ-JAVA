import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon14467 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        int[] cow= new int[11];
        Arrays.fill(cow, 2);
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            if(cow[x]!=y && cow[x]!=2){
                cow[x]=y;
                ans++;
            }
            else if(cow[x]==2){
                cow[x]= y;
            }
        }

        System.out.println(ans);
    }
}
