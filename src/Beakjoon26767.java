import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26767 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        for(int i=1; i<=n;i++){
            if(i%7==0){
                if(i%11==0){
                    sb.append("Wiwat!\n");
                }
                else{
                    sb.append("Hurra!\n");
                }
            }
            else{
                if(i%11==0){
                    sb.append("Super!\n");
                }
                else{
                    sb.append(i+"\n");
                }
            }
        }

        System.out.println(sb);
    }
}
