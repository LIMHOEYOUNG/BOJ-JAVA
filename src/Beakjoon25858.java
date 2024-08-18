import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        StringBuilder sb= new StringBuilder();

        int num[]= new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(br.readLine());
            total+=num[i];
        }

        for(int i=0;i<n;i++){
            sb.append((d*num[i])/total+"\n");
        }

        System.out.println(sb);
    }
}
