import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon27213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int m= Integer.parseInt(br.readLine());
        int n= Integer.parseInt(br.readLine());

        System.out.println(m*n-(m>2 && n>2?(m-2)*(n-2):0));
    }
}
