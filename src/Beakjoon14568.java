import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon14568 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        //i남 j영 k택
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                for(int k=2;k<=n-i-j;k+=2){
                    if((i>=j+2)&&(i+j+k==n)) ans++;
                    else if(i+j+k>n) break;
                }
            }
        }

        System.out.println(ans);
    }
}
