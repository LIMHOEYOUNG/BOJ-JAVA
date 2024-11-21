import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Beakjoon5988 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            BigInteger num= new BigInteger(br.readLine());

            if(num.mod(new BigInteger("2"))==BigInteger.ZERO){
                sb.append("even\n");
            }
            else{
                sb.append("odd\n");
            }
        }

        System.out.println(sb);
    }
}
