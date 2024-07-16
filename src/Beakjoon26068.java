import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon26068 {
        public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans=0;
        while(n-->0){
            String str= br.readLine();
            String day= str.replace("D-","");
            if(Integer.parseInt(day)<=90) ans++;
        }

        System.out.println(ans);
    }
}
