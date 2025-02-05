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

            sb.append((n*(n+1)*(2*n+1))/6+"\n");    //시그마 수식 sigma k=1 to n {(n-k+1)^2}
            /*
            int ans= 0;

            //수식 없이
            for(int i=1;i<=n;i++){
                ans+= Math.pow((n-(i-1)),2);
            }

            sb.append(ans+"\n");
             */
        }

        System.out.println(sb);
    }
}
