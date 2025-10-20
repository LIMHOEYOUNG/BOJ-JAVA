import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11109 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            long d= Long.parseLong(st.nextToken());
            long n= Long.parseLong(st.nextToken());
            long s= Long.parseLong(st.nextToken());
            long p= Long.parseLong(st.nextToken());

            long a= d+ n*p;
            long b= n*s;

            sb.append(a<b?"parallelize":a==b?"does not matter":"do not parallelize").append("\n");
        }

        System.out.print(sb);
    }
}
