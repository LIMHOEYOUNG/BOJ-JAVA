import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        BigInteger p= new BigInteger(st.nextToken());
        BigInteger k= new BigInteger(st.nextToken());

        String ans= "GOOD";

        for(BigInteger i= BigInteger.TWO; k.compareTo(i)>0; i=i.add(BigInteger.ONE)){
            if((p.remainder(i)).compareTo(BigInteger.ZERO)==0){
                ans= "BAD "+i;
                break;
            }
        }

        System.out.println(ans);
    }
}
