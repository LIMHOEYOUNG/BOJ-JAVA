import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon24087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int s= Integer.parseInt(br.readLine());
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());

        int ans=250;
        for(;a<s;a+=b){
            ans+=100;
        }

        System.out.println(ans);
    }
}
