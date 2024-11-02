import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int ans=0;

        for(int i=0;i<n;i++){
            int check= Integer.parseInt(br.readLine());
            if(check%2!=0) ans++;
        }

        System.out.println(ans);
    }
}
