import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        double h= Double.parseDouble(st.nextToken());
        double w= Double.parseDouble(st.nextToken());
        double n= Double.parseDouble(st.nextToken());
        double m= Double.parseDouble(st.nextToken());

        System.out.println((long)(Math.ceil(h/(n+1))* Math.ceil(w / (m + 1))));
    }
}
