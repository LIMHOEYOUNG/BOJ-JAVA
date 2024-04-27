import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon5532 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int l= Integer.parseInt(br.readLine());
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        int d= Integer.parseInt(br.readLine());

        int math = b/d + (b%d!=0?1:0);
        int korean = a/c + (a%c!=0?1:0);

        int day = l-Math.max(korean,math);

        System.out.println(day>=0?day:0);
    }
}
