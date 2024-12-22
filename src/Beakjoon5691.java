import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5691 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while (true) {
            StringTokenizer st= new StringTokenizer(br.readLine());

            int num1= Integer.parseInt(st.nextToken());
            int num2= Integer.parseInt(st.nextToken());

            if(num1==0 && num2==0) break;

            sb.append(num1-(num2-num1)).append("\n");   //2*num1 - num2
        }

        System.out.println(sb);
    }
}