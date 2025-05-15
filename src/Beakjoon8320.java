import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon8320 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        //int i=0;i<=(int)Math.sqrt(n);i++
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i*j<=n) ans++;
            }
        }

        //System.out.println("========");
        System.out.println(ans);
    }
}
