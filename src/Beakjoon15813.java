import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15813 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        String str= br.readLine();
        int ans= 0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            ans+= (c-'A')+1;
        }

        System.out.println(ans);
    }
}
