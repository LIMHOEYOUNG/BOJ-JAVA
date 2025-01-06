import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3578 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        String f= "4";
        String e= "8";

        if(n==0) System.out.println(1);
        else if(n==1) System.out.println(0);
        else{
            sb.append(f.repeat(n%2)).append(e.repeat(n/2));
        }

        System.out.println(sb);
    }
}