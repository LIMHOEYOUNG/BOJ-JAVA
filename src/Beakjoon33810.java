import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Beakjoon33810 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        String s= "SciComLove";
        int ans= 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=s.charAt(i)){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
