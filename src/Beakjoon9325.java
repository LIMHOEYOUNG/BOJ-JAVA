import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9325 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int s= Integer.parseInt(br.readLine());
            int n= Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                s+=Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
            }

            sb.append(s+"\n");
        }

        System.out.println(sb);
    }
}
