import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            if(i==(n-1)){
                for(int j=0;j<2*n-1;j++) sb.append("*");
            }
            else {
                for (int j = 0; j < (n - (i + 1)); j++) {
                    sb.append(" ");
                }
                sb.append("*");

                for (int j = 0; j < 2 * i - 1; j++) {
                    sb.append(" ");
                }
                if (i != 0) sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
