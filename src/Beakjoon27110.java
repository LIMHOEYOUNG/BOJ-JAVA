import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon27110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());

        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        int ans=0;
        ans+=Math.min(n,a);
        ans+=Math.min(n,b);
        ans+=Math.min(n,c);

        System.out.println(ans);
    }
}
