import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon23794 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        String space=" ";
        String at= "@";

        for(int i=0;i<(n+2);i++){
            sb.append(at).append(i==0?at.repeat(n):i==(n+1)?at.repeat(n):space.repeat(n)).append(at).append("\n");
        }

        System.out.print(sb);
    }
}
