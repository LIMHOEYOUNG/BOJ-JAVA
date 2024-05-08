import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());

        int e= Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        System.out.println(a+b-c);
        System.out.println(e-c);

    }
}
