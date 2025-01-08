import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            long a= (long)Math.pow(Long.parseLong(st.nextToken()),2);
            long b= (long)Math.pow(Long.parseLong(st.nextToken()),2);
            long c= (long)Math.pow(Long.parseLong(st.nextToken()),2);

            long max= Math.max(a,Math.max(b,c));

            sb.append(String.format("Scenario #%d:\n",i)).append((a+b+c-max==max)?"yes\n":"no\n");
            if(i!=n) sb.append("\n");
        }

        System.out.println(sb);
    }
}