import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10188 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int x= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(x-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int r= Integer.parseInt(st.nextToken());
            int c= Integer.parseInt(st.nextToken());

            for(int i=0;i<c;i++){
                for(int j=0;j<r;j++){
                    sb.append("X");
                }
                sb.append("\n");
            }
            sb.append("\n\n");
        }

        System.out.println(sb);
    }
}
