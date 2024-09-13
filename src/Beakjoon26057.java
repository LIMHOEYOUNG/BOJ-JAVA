import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon26057 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long l= Long.parseLong(br.readLine());
        long t= Long.parseLong(br.readLine());

        System.out.println(2*t-l);
    }
}
