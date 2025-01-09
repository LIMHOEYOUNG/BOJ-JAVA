import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int n= Integer.parseInt(st.nextToken());
            int m= Integer.parseInt(st.nextToken());
            int ans= 0;

            for(int i=1;i<n;i++){
                for(int j=(i+1);j<n;j++){
                    if((Math.pow(i,2)+Math.pow(j,2)+m)%(i*j)==0) ans++;
                }
            }

            sb.append(ans+"\n");
        }

        System.out.println(sb);
    }
}