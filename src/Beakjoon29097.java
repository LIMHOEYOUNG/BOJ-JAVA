import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        int a= Integer.parseInt(st.nextToken())*n;
        int b= Integer.parseInt(st.nextToken())*m;
        int c= Integer.parseInt(st.nextToken())*k;

        int max= Math.max(a,Math.max(b,c));

        if(max==a) sb.append("Joffrey ");
        if(max==b) sb.append("Robb ");
        if(max==c) sb.append("Stannis");

        System.out.println(sb);
    }
}
