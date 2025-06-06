import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11134 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            sb.append((n/c)+(n%c!=0?1:0)+"\n");
        }

        System.out.println(sb);
    }
}
