import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Beakjoon17466 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        long n= Long.parseLong(st.nextToken());
        long p= Long.parseLong(st.nextToken());
        long ans= 1;

        if(n==(p-1)) {
            System.out.println(n);
            return;
        }

        for(long i=1;i<=n;i++){
            ans= (ans*i)%p;
        }

        System.out.println(ans);
    }
}
