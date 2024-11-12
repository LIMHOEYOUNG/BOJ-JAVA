import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            if((i+1)%2==0){
                sb.append(" ");
            }

            for(int j=0;j<n;j++){
                sb.append("* ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
