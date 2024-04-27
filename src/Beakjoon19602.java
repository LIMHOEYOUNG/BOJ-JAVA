import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon19602 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int s= Integer.parseInt(br.readLine());
        int m= Integer.parseInt(br.readLine());
        int l= Integer.parseInt(br.readLine());

        System.out.println((s + 2*m + 3*l)>=10?"happy":"sad");
    }
}
