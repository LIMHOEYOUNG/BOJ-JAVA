import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3062 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringBuilder num= new StringBuilder(br.readLine());
            int original_num= Integer.parseInt(num.toString());
            int reverse_num= Integer.parseInt(num.reverse().toString());

            num= new StringBuilder(Integer.toString(original_num+reverse_num));
            sb.append((num.toString().equals(num.reverse().toString()))?"YES\n":"NO\n");
        }

        System.out.println(sb);
    }
}
