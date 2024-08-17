import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon28635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());

        int cnt=0;

        while(b!=c){
            //System.out.println(b);
            b++;
            cnt++;
            if(b>a) b=1;
        }

        System.out.println(cnt);
    }
}
