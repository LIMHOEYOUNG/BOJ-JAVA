import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int n= Integer.parseInt(br.readLine());
        int target;

        while((target=Integer.parseInt(br.readLine()))!=0){
            sb.append((target%n==0)? target+" is a multiple of "+n+".\n": target+" is NOT a multiple of "+n+".\n");

        }

        System.out.println(sb);
    }
}
