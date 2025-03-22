import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2851 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int ans= 0;

        for(int i=0;i<10;i++){
            int n= Integer.parseInt(br.readLine());
            if((n+ans)<=100) ans+=n;
            else{
                int tmp1= Math.abs(100-ans);
                int tmp2= Math.abs(100-(ans+n));
                ans= tmp1==tmp2?(ans+n):(tmp1<tmp2?ans:(ans+n));
                break;
            }

            if(n==100) break;
        }

        System.out.println(ans);
    }
}
