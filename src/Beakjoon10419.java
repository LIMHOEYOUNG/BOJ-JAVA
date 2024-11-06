import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            int n= Integer.parseInt(br.readLine());
            int check=1;
            while(true){
                if((check+Math.pow(check,2))>n){
                    sb.append((check-1)+"\n");
                    break;
                }
                check++;
            }
        }

        System.out.println(sb);
    }
}
