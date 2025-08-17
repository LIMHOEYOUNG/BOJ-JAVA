import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15780 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int ans= 0;

        st= new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int hole= Integer.parseInt(st.nextToken());

            ans+= hole/2 + (hole%2!=0?1:0);
        }

        System.out.println(n<=ans?"YES":"NO");
    }
}
