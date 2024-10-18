import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Beakjoon31607 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());

        int max= Math.max(a,Math.max(b,c));

        System.out.println((a+b+c)-max!=max?0:1);
    }
}
