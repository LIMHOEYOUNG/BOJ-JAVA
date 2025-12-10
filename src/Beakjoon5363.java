import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon5363 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            String[] str= br.readLine().split(" ");
            sb.append(String.join(" ",Arrays.copyOfRange(str,2,str.length))).append(" ").append(str[0]).append(" ").append(str[1]).append("\n");
        }

        System.out.print(sb);
    }
}
