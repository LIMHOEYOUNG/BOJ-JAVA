import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9093 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //9093
        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                sb.append((new StringBuilder(st.nextToken()).reverse())).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
