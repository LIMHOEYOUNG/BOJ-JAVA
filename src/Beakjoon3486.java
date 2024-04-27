import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon3486 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String num1= new StringBuilder(st.nextToken()).reverse().toString();
            String num2= new StringBuilder(st.nextToken()).reverse().toString();

            int num= Integer.parseInt(num1)+ Integer.parseInt(num2);

            sb.append(Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString())+"\n");

        }

        System.out.println(sb);
    }
}
