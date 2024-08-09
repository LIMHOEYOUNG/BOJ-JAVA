import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());
        String[] jpgs= new String[n];

        for(int i=0;i<n;i++){
            jpgs[i]=br.readLine();
        }

        n= Integer.parseInt(br.readLine());
        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());

            for(int i=s-1;i<e;i++){
                sb.append(jpgs[i]+"\n");
            }
        }

        System.out.println(sb);
    }
}
