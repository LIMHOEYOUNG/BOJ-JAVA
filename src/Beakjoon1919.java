import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Beakjoon1919 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> alpha = new ArrayList<Character>();

        String str1= br.readLine();;
        String str2= br.readLine();;

        int check=0;
        String str_long= str1.length()>=str2.length()?str1:str2;
        String str_short= str_long.equals(str1)?str2:str1;
        for(int j=0;j<str_long.length();j++){
            alpha.add(str_long.charAt(j));
        }
        for(int j=0;j<str_short.length();j++){
            char c= str_short.charAt(j);
            if(alpha.contains(c)){
                check++;
                alpha.remove(alpha.indexOf(c));
            }
        }
        System.out.println((str_long.length()+str_short.length()-2*check));
    }
}
