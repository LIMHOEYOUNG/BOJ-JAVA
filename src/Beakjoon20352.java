import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20352 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double a= Double.parseDouble(br.readLine());
        System.out.println(String.format("%.10f",(Math.sqrt(a/Math.PI)*2*Math.PI)));
    }
}
