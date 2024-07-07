import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon29738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=1;i<=n;i++){
            sb.append(String.format("Case #%d: ",i));
            int rank= Integer.parseInt(br.readLine());
            if(rank>4500) sb.append("Round 1\n");
            else if (1000<rank && rank<=4500) sb.append("Round 2\n");
            else if (25<rank && rank<=1000) sb.append("Round 3\n");
            else sb.append("World Finals\n");

        }

        System.out.println(sb);
    }
}
