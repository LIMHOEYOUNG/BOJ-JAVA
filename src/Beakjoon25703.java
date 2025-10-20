import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon25703 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        sb.append("int a;").append("\n").append("int *ptr = &a;").append("\n");
        String star= "*";

        for(int i=2;i<=n;i++){
            sb.append("int ").append(star.repeat(i)).append("ptr").append(i).append(" = ").append("&ptr").append((i-1)>1?(i-1):"").append(";\n");
        }

        System.out.print(sb);
    }
}
