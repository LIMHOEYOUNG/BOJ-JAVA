import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon13322 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}
