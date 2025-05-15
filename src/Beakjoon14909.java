import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14909 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int ans= 0;
        StringTokenizer st= new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())>0) ans++;
        }

        System.out.println(ans);
    }
}
