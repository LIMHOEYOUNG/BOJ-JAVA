import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Beakjoon25400 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] num= new int[n+1];

        for(int i=1;i<=n;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        int std= 1;
        int ans= 0;
        for(int i=1;i<=n;i++){
            while(true){
                if(i>n || std==num[i]) break;

                ans+=1;
                i++;
            }
            std++;
        }
        System.out.println(ans);
    }
}
