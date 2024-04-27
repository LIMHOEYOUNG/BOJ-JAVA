import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int n= Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int ans= Integer.MIN_VALUE;

            while(st.hasMoreTokens()) {
                int w = Integer.parseInt(st.nextToken());
                ans = Math.max(ans, w);
            }

            sb.append("Case #"+i+": "+ans+"\n");
        }

        System.out.println(sb);
    }
}
