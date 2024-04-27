import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11365 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true){
            String str= br.readLine();
            if(str.equals("END")) break;

            for(int i=0;i<str.length();i++){
                char c= str.charAt(str.length()-1-i);
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
