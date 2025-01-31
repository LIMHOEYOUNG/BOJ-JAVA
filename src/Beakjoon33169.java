import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon33169 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Integer.parseInt(br.readLine())*1000 + Integer.parseInt(br.readLine())*10000);
    }
}
