import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            double a= Double.parseDouble(st.nextToken());
            double b= Double.parseDouble(st.nextToken());

            //sSystem.out.println(String.format("%.1f",Math.abs(b-a)));
            sb.append(String.format("%.1f",Math.abs(b-a))+"\n");
        }
        System.out.println(sb);
    }
}
