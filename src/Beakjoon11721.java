import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        for(int i=0;i<str.length();){
            System.out.println(str.substring(i,i+10>str.length()?str.length():i+10));
            i+=10;
            //System.out.println("i = "+i+" subString = "+str.charAt(i));
        }
    }
}
