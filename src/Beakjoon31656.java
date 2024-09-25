import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char c= str.charAt(i);

            if(sb.charAt(sb.length()-1)!=c) sb.append(c);

        }

        System.out.println(sb);
    }
}
