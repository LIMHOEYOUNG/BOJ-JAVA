import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());

        while(n-->0){
            int y= Integer.parseInt(br.readLine());
            int a= y%100;
            if((y+1)%a==0) sb.append("Good\n");
            else sb.append("Bye\n");
        }

        System.out.println(sb);
    }
}
