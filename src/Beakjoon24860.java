import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon24860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long ans=0;
        for(int i=0;i<2;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ans+=(Long.parseLong(st.nextToken())*Long.parseLong(st.nextToken()));
            //System.out.println(ans);
        }

        StringTokenizer st= new StringTokenizer(br.readLine());
        ans*=(Long.parseLong(st.nextToken())*Long.parseLong(st.nextToken())*Long.parseLong(st.nextToken()));

        System.out.println(ans);
    }
}
