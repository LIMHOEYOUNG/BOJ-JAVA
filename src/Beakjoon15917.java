import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon15917 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<t;i++){
            long n= Integer.parseInt(br.readLine());
            long convert_1= n;
            long convert_2= -n;

            sb.append(((convert_1 & convert_2) == n) ? "1\n" : "0\n");
        }

        System.out.println(sb);
    }
}
