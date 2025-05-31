import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon4150 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        if(n==0) System.out.println(0);
        else {
            BigInteger num[]= new BigInteger[n + 1];
            num[0]= BigInteger.ZERO;
            num[1]= BigInteger.ONE;
            //num[2]= BigInteger.ONE;

            if (n > 1) {
                for (int i=2; i<=n; i++) {
                    num[i]= num[i-1].add(num[i-2]);
                }
            }

            System.out.println(num[n]);

            //System.out.println(num[n].toString().length());
        }
    }
}
/*
354224848179261915075
354224848179261915075
354224848179261915075
354224848179261915075
 */