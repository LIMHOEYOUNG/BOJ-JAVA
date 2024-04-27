import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon1964 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
       //BigInteger answer = new BigInteger("0");
        long answer =5;
        long dot= 7;
        for(int i=1;i<n;i++){
            answer+=dot;
            dot+=3;
        }

        System.out.println(answer%45678);
    }
}
