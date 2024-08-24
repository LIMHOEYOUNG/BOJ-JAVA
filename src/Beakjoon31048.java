import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int num=Integer.parseInt(br.readLine());
            int ans=1;

            for(int i=num;i>0;i--){
                ans= (ans*i)%10;
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb);
    }
}
