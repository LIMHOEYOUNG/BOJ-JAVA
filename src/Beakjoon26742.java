import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon26742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        int b=0;
        int c=0;

        for(int i=0;i<str.length();i++){
            char check= str.charAt(i);
            if(check=='B') b++;
            else if(check=='C') c++;
        }

        System.out.println(b/2+c/2);
    }
}
