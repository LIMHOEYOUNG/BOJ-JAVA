import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon9085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int t= Integer.parseInt(br.readLine());

        while(t-->0){
            int n= Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            BigInteger sum= new BigInteger("0");
            for(int i=0;i<n;i++){
                sum= sum.add(new BigInteger(st.nextToken()));
            }
            sb.append(sum+"\n");
        }

        System.out.println(sb);
    }
}
