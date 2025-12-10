import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Beakjoon11312 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            long a= Long.parseLong(st.nextToken());
            long b= Long.parseLong(st.nextToken());

            sb.append((long)Math.pow(a/b,2)).append("\n");
        }

        System.out.print(sb);
    }
}