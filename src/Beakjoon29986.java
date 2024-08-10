import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int ans=0;
        while(st.hasMoreTokens()){
            if(h>=Integer.parseInt(st.nextToken())) ans++;
        }
        System.out.println(ans);
    }
}
