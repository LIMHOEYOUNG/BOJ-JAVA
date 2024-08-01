import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon24196 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        String str= br.readLine();

        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            i+=(str.charAt(i)-'A');
        }

        System.out.println(sb);
    }
}
