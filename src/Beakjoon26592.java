import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            sb.append("The height of the triangle is ").append(String.format("%.2f",((2*Double.parseDouble(st.nextToken()))/Double.parseDouble(st.nextToken())))).append(" units\n");
        }

        System.out.println(sb);
    }
}
