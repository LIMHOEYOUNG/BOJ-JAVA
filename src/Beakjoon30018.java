import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int ans= 0;
        StringTokenizer st1= new StringTokenizer(br.readLine());
        StringTokenizer st2= new StringTokenizer(br.readLine());

        while(st1.hasMoreTokens()){
            int a= Integer.parseInt(st1.nextToken());
            int b= Integer.parseInt(st2.nextToken());

            ans+=(b-a>0)?(b-a):0;
        }

        System.out.println(ans);
    }
}
