import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon21612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int b= Integer.parseInt(br.readLine());
        int p=5*b-400;

        System.out.println(p);
        System.out.println(p>100?-1:p==100?0:1);
    }
}
