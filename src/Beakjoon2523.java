import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        String star= "*";

        for(int i=1;i<=n;i++){
            sb.append(star.repeat(i)+"\n");
        }
        for(int i=n-1;i>0;i--){
            sb.append(star.repeat(i)+"\n");
        }

        System.out.println(sb);
    }
}
