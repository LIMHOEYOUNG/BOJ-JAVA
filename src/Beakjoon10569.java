import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int v= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());

            sb.append((e-v+2)+"\n");
        }

        System.out.println(sb);
    }
}
