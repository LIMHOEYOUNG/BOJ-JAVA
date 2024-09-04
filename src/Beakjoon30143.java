import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Beakjoon30143 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int a= Integer.parseInt(st.nextToken());
            int d= Integer.parseInt(st.nextToken());

            int ans= 0;
            for(int i=0;i<n;i++){
                ans+=a;
                a+=d;
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb);

    }
}
