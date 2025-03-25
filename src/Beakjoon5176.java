import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5176 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int p= Integer.parseInt(st.nextToken());
            int m= Integer.parseInt(st.nextToken());
            boolean seat[]= new boolean[m+1];
            int ans= 0;

            for(int i=0; i<p;i++){
                int n= Integer.parseInt(br.readLine());
                if(seat[n]) ans++;
                else seat[n]=true;
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb);
    }
}
