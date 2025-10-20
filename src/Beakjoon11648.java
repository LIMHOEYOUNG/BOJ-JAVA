import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon11648 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        BigInteger num= new BigInteger(br.readLine());
        int ans= 0;

        while(true){
            BigInteger n= BigInteger.ONE;
            if(num.divide(BigInteger.TEN).equals(BigInteger.ZERO)) break;

            while(true){
                n= n.multiply(num.mod(BigInteger.TEN));
                num= num.divide(BigInteger.TEN);

                if(num.divide(BigInteger.TEN).equals(BigInteger.ZERO)) {
                    n= n.multiply(num.mod(BigInteger.TEN));
                    break;
                }
            }

            ans+=1;
            num= n;
        }

        System.out.println(ans);
    }
}