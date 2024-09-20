import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31612 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();

        int cnt= 0;

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);

            if(c=='o' || c=='O') cnt+=1;
            else cnt+=2;
        }

        System.out.println(cnt);
    }
}
