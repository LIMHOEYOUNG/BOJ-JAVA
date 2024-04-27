import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon27855 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int h1= Integer.parseInt(st.nextToken());
        int b1= Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int h2= Integer.parseInt(st.nextToken());
        int b2= Integer.parseInt(st.nextToken());

        int p1= 3*h1 + b1;
        int p2= 3*h2 + b2;

        System.out.println(p1==p2?"NO SCORE":p1>p2?"1 "+(p1-p2):"2 "+(p2-p1));
    }
}
