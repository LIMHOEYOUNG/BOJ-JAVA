import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(sb.isEmpty()){
                sb.append(str.charAt(i));
                continue;
            }

            char c= str.charAt(i);

            if(sb.charAt(sb.length()-1)!=c) sb.append(c);

        }

        System.out.println(sb);
    }
}
