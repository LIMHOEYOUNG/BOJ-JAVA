import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon16673 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int c= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int p= Integer.parseInt(st.nextToken());
        long ans= 0;

        for(int i=1;i<=c;i++){
            ans+= (k*i)+(p*Math.pow(i,2));
        }
        System.out.println(ans);
    }
}
