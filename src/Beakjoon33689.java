import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon33689 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        for(int i=0;i<n;i++){
            String str= br.readLine();
            char c= str.charAt(0);

            if(c=='c' || c=='C') ans++;
        }

        System.out.println(ans);
    }
}
