import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon10829 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        BigInteger n= new BigInteger(br.readLine());
        StringBuilder sb= new StringBuilder();

        //System.out.println(n.toString(2));

        while(!n.equals(new BigInteger("0"))){
            BigInteger a= n.mod(new BigInteger("2"));
            n= n.divide(new BigInteger("2"));
            sb.insert(0,a);
        }

        System.out.println(sb);
    }
}
/*
111011100110101100101000000000
111011100110101100101000000000

111001100010000011110100100000000000000
101011110011101100100000000000000000000
101011110100110100100001110101000000000000
10110101111001100010000011110100100000000000000
 */