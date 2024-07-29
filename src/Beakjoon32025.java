import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int h= Integer.parseInt(br.readLine());
        int w= Integer.parseInt(br.readLine());

        System.out.println(Math.min(w,h)*50);
    }
}
