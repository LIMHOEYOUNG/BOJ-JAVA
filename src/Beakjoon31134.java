import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int t= Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            Long n= Long.parseLong(br.readLine());

            sb.append((n*2-1)+"\n");
        }

        System.out.println(sb);
    }
}
