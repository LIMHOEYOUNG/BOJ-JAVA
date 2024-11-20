import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=n;i>0;i--){
            for(int j=i-1;j>0;j--) sb.append(" ");
            if(n==i) sb.append("*\n");
            else{
                sb.append("*");
                for(int j=0;j<2*(n-i)-1;j++) sb.append(" ");
                sb.append("*\n");
            }
        }

        System.out.println(sb);
    }
}
