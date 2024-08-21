import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31495 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();

        if((str.length()<=2) || !((str.substring(0,1).equals("\""))&&(str.substring(str.length()-1,str.length()).equals("\"")))){
            System.out.println("CE");
        }
        else{
            System.out.println(str.substring(1,str.length()-1));
        }
    }
}
