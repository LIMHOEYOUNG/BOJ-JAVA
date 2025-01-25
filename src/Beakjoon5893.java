import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon5893 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();

        BigInteger a= new BigInteger(str,2);
        a= a.multiply(new BigInteger("17"));
        System.out.println(a.toString(2));
    }
}
