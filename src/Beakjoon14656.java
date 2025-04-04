import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14656 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int ans= 0;

        for(int i=1;i<=n;i++){
            if(i!=Integer.parseInt(st.nextToken())) ans++;
        }

        System.out.println(ans);
    }
}
