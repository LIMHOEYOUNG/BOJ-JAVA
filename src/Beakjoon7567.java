import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon7567 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int ans= 10;

        char b= str.charAt(0);
        for(int i=1;i<str.length();i++){
            char c= str.charAt(i);
            if(c==b) ans+=5;
            else{
                b=c;
                ans+=10;
            }
        }

        System.out.println(ans);
    }
}
