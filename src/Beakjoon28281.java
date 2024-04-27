import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon28281 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int x= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());

        int ans= Integer.MAX_VALUE;

        int preDay= Integer.parseInt(st.nextToken())*x;
        int toDay= 0;

        while(st.hasMoreTokens()){
            toDay= Integer.parseInt(st.nextToken())*x;
            ans= Math.min(ans,preDay+toDay);
            preDay=toDay;
        }

        System.out.println(ans);
    }
}
