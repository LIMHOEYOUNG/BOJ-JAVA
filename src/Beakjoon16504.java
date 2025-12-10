import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16504 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        long ans= 0;

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                ans += Long.parseLong(st.nextToken());
            }
        }

        System.out.println(ans);
    }
}
