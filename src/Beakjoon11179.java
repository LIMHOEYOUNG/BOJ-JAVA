import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon11179 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder(Integer.toBinaryString(Integer.parseInt(br.readLine())));
        sb.reverse();
        System.out.println(Integer.parseInt(sb.toString(),2));
    }
}
