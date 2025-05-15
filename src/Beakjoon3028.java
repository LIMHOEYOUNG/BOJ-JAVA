import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon3028 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int ans= 1;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c=='A'){ //1 2
                if(ans==1) ans=2;
                else if(ans==2) ans=1;
            }
            else if(c=='B'){ //2 3
                if(ans==2) ans=3;
                else if(ans==3) ans=2;
            }
            else if(c=='C'){ //1 3
                if(ans==1) ans=3;
                else if(ans==3) ans=1;
            }
        }

        System.out.println(ans);
    }
}
