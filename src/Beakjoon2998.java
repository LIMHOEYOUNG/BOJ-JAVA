import java.io.*;
import java.math.*;

public class Beakjoon2998 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print(new BigInteger(br.readLine(),2).toString(8));
    }
}