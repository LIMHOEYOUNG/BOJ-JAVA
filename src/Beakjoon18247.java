import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon18247 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int m= Integer.parseInt(st.nextToken());

            if(n<12 || m<4) sb.append(-1).append("\n");
            else{
                sb.append((11*m +4)).append("\n");
            }
        }

        System.out.print(sb);
    }
}