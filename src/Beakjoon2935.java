import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String a= br.readLine();
        String op= br.readLine();
        String b= br.readLine();

        BigInteger bi= new BigInteger("0");
        if(op.equals("*")){
            bi= new BigInteger(a).multiply(new BigInteger(b));
        }
        else if(op.equals("+")){
            bi= new BigInteger(a).add(new BigInteger(b));
        }

        System.out.println(bi);
    }
}
