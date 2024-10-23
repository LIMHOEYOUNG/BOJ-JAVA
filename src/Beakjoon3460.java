import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3460 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int n= Integer.parseInt(br.readLine());

            int cnt= 0;
            while(n>0){
                if(n%2==1){
                    sb.append(cnt+" ");
                }

                n/=2;
                cnt++;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
