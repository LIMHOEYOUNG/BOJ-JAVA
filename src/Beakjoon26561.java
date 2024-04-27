import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26561 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        int n= Integer.parseInt(br.readLine());

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int p= Integer.parseInt(st.nextToken());
            int t= Integer.parseInt(st.nextToken());

            p+=(t/4)-(t/7);
            sb.append(p+"\n");
        }

        System.out.println(sb);
    }
}
