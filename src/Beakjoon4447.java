import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon4447 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            String str= br.readLine();
            sb.append(str).append(" is ");
            int g= 0;
            int b= 0;

            for(int j=0;j<str.length();j++){
                char c= str.charAt(j);
                if(c=='G' || c=='g') g++;
                else if(c=='B' || c=='b') b++;
            }

            sb.append(g>b?"GOOD":g==b?"NEUTRAL":"A BADDY").append("\n");
        }

        System.out.print(sb);
    }
}
