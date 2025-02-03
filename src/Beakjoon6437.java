import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon6437 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        for(int i=1;;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int p= Integer.parseInt(st.nextToken());
            int s= Integer.parseInt(st.nextToken());

            if(p==0&&s==0) break;

            int d= p-s;

            sb.append("Hole #"+i+"\n");
            if(s==1) sb.append("Hole-in-one.\n");
            else if(d<=-2) sb.append("Double Bogey.\n");
            else if(d==-1) sb.append("Bogey.\n");
            else if(d==0) sb.append("Par.\n");
            else if(d==1) sb.append("Birdie.\n");
            else if(d==2) sb.append("Eagle.\n");
            else if(d>=3) sb.append("Double eagle.\n");

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
