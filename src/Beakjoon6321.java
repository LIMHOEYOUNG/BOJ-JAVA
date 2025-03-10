import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon6321 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            String str= br.readLine();
            sb.append("String #"+i+"\n");

            for(int j=0;j<str.length();j++){
                char c= str.charAt(j);

                if(c=='Z') sb.append('A');
                else sb.append((char) (c + 1));
            }

            sb.append("\n\n");
        }
        System.out.println(sb);
    }
}
