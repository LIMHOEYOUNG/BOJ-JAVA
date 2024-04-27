import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2444 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        int line= 2*n-1;

        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--) sb.append(" ");
            for(int k=0;k<(i+1)*2-1;k++) sb.append("*");
            sb.append("\n");
        }

        for(int i=n-1;i>0;i--){
            for(int j=n-i;j>0;j--) sb.append(" ");
            for(int k=0;k<i*2-1;k++) sb.append("*");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
