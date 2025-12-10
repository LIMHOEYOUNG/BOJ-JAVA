import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon7523 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            sb.append("Scenario #").append((i+1)).append(":\n");
            StringTokenizer st= new StringTokenizer(br.readLine());
            long a= Long.parseLong(st.nextToken());
            long l= Long.parseLong(st.nextToken());

            if(a==l){
                sb.append(a).append("\n");
            }
            else{
                long n= l-a+1;
                sb.append((n*(a+l)/2)).append("\n");
            }
            sb.append(i!=t-1?"\n":"");
        }
        System.out.print(sb);
    }
}