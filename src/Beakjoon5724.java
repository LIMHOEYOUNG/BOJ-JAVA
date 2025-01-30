import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            int n= Integer.parseInt(br.readLine());
            if(n==0) break;
            int ans= 0;

            for(int i=1;i<=n;i++){
                ans+= Math.pow((n-(i-1)),2);
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb);
    }
}
