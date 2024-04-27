import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3417 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        while(true){
            String str1= br.readLine();
            if(str1.equals("0")) break;
            String str2= br.readLine();

            for(int i=0;i<str2.length();i++){
                char pwKey= str1.charAt(i%str1.length());
                char alpa= str2.charAt(i);

                char check = (char)((pwKey-'A')+alpa<'Z'?(pwKey-'A')+alpa+1:(pwKey-'A')+alpa-'Z'+'A');

                sb.append(check);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}