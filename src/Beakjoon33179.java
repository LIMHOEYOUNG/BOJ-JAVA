import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon33179 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int t= 0;
        for(int i=0;i<n;i++){
            int p= Integer.parseInt(st.nextToken());

            if(p%2!=0) t+=(p+1);
            else t+=p;
        }

        System.out.println(t/2);
    }
}
