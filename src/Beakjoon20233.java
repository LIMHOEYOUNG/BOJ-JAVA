import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon20233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        int x= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int y= Integer.parseInt(br.readLine());
        int t= Integer.parseInt(br.readLine());

        System.out.println(a+(21*(Math.max(t-30,0))*x));
        System.out.println(b+(21*(Math.max(t-45,0))*y));
    }
}
