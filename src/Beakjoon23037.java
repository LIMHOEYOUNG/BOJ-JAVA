import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon23037 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        long ans= 0;
        for(int i=0;i<str.length();i++){
            int n= str.charAt(i)-'0';

            ans+=Math.pow(n,5);
        }

        System.out.println(ans);
    }
}
