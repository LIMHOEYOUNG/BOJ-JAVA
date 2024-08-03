import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon24356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int t1= Integer.parseInt(st.nextToken());
        int m1= Integer.parseInt(st.nextToken());
        int t2= Integer.parseInt(st.nextToken());
        int m2= Integer.parseInt(st.nextToken());

        int ans=0;

        ans+=(t2*60+m2)-(t1*60+m1);

        ans=ans<0?1440+ans:ans;

        System.out.println(ans+" "+(ans/30));
    }
}
