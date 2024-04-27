import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();

        int blank= n-1;

        for(int i=0;i<n;i++){
            for(int j=i;j<blank;j++){
                sb.append(" ");
            }
            for(int k=0;k<i+1;k++){
                sb.append("*"+" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
