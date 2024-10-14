import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        String str1= br.readLine();
        String str2= br.readLine();

        int ans= 0;
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=str2.charAt(i)) ans++;
        }

        System.out.println(ans);
    }
}
