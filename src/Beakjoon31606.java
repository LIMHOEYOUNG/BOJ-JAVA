import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon31606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int x= Integer.parseInt(br.readLine());
        int y= Integer.parseInt(br.readLine());

        System.out.println(x+y+3);
    }
}
