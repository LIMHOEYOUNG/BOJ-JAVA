import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon33163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            char c= str.charAt(i);

            sb.append(c=='J'?'O':c=='O'?'I':'J');
        }

        System.out.println(sb);
    }
}
