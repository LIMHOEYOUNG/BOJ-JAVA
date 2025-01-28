import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9724 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            long ans= 0;
            long cnt= 0;
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            for(int j=1; cnt<=2000000000;j++){
                cnt=j*j*j;

                if(a<=cnt && cnt<=b) ans++;
            }

            sb.append("Case #"+i+": "+ans+"\n");
        }

        System.out.println(sb);
    }
}
