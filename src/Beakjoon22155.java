import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon22155 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb =new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int i= Integer.parseInt(st.nextToken());
            int f= Integer.parseInt(st.nextToken());

            sb.append(((i<=1&&f<=2)||(i<=2&&f<=1))?"Yes\n":"No\n");
        }

        System.out.println(sb);
    }
}
