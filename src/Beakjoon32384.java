import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            sb.append("LoveisKoreaUniversity ");
        }

        System.out.println(sb);
    }
}
