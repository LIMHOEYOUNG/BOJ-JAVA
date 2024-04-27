import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10480 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            int num= Integer.parseInt(br.readLine());

            if(num%2==0){
                sb.append(num+" is even\n");
            }
            else{
                sb.append(num+" is odd\n");
            }
        }

        System.out.println(sb);
    }
}
