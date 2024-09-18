import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2921 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        long ans=0;

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                ans+=(i+j);
            }
        }

        System.out.println(ans);
    }
}
