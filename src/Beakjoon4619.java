import java.awt.event.MouseAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int b= Integer.parseInt(st.nextToken());
            int n= Integer.parseInt(st.nextToken());

            if(b==0&&n==0)break;

            int check= (int)Math.pow(b,(1.0/n));
            int c1= (int)Math.abs(b-Math.pow(check+1,n));
            int c2= (int)Math.abs(b-Math.pow(check,n));

            sb.append((c1>c2?check:check+1)+"\n");
        }

        System.out.println(sb);
    }
}
