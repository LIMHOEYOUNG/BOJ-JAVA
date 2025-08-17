import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon18883 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            for(int j=1;j<=m;j++){
                sb.append((i*m+j)).append(j!=m?" ":"\n");
            }
        }

        System.out.println(sb);
    }
}
