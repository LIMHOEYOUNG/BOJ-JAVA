import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Beakjoon16968 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        boolean check= str.charAt(0)=='d'?true:false;   //false == d, true == c;
        int ans= 1;

        for(char c:str.toCharArray()){
            //System.out.println((check?(c=='c'?25:10):(c=='d'?9:26))+" "+(c=='d'?"false":"true"));
            ans*= check?(c=='c'?25:10):(c=='d'?9:26);

            check= c=='d'?false:true;
        }

        System.out.println(ans);
    }
}
