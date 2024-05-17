import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon21335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double a= Double.parseDouble(br.readLine());

        System.out.println(String.format("%.9f",(2*Math.PI*(Math.sqrt((a)/Math.PI)))));
    }
}
