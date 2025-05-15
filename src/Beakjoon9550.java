import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9550 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int ans= 0;
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int k= Integer.parseInt(st.nextToken());
            st= new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                ans+= Integer.parseInt(st.nextToken())/k;
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb);
    }
}
/*
1
7 1
1 1 1 1 1 1 1
 */