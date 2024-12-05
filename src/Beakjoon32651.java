import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon32651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long n= Long.parseLong(br.readLine());

        System.out.println((n<=100000 && (n%2024==0))?"Yes":"No");
    }
}
