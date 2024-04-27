import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon18198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int teamA= 0;
        int teamB= 0;


        String str= br.readLine();
        for(int i=0;i<str.length();i+=2){
            char team= str.charAt(i);
            if(team=='A') teamA+=(int)str.charAt(i+1) -'0';
            else teamB+=(int)str.charAt(i+1) - '0';
        }

        System.out.println(teamA>teamB?"A":"B");
    }
}
