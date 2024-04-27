import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon27434 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        if(n==0){
            System.out.println(1);
            return;
        }

        System.out.println(cal(1,n));
    }

    public static BigInteger cal(int a, int n){
        BigInteger result = BigInteger.valueOf(a);

        if(a<n){
            int half = (a+n)/2;
            result = cal(a,half).multiply(cal(half+1,n));
        }

        return result;
    }
}
