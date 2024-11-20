import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        int a= 0;
        int b= 0;

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c=='A') a++;
            else if(c=='B') b++;
        }

        System.out.println(a>b?"A":a==b?"Tie":"B");
    }
}
