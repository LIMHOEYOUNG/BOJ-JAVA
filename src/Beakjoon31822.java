import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine().substring(0,5);

        int n= Integer.parseInt(br.readLine());
        int ans=0;

        while(n-->0){
            String check= br.readLine().substring(0,5);
            if(str.equals(check)) ans++;
        }

        System.out.println(ans);
    }
}
