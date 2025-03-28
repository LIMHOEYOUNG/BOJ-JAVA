import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon2789 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String s= "CAMBRIDGE";
        String str= br.readLine();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(!(s.contains(Character.toString(str.charAt(i))))) sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}
