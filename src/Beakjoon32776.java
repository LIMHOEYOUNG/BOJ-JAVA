import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int sab= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int ma= Integer.parseInt(st.nextToken());
        int fab= Integer.parseInt(st.nextToken());
        int mb= Integer.parseInt(st.nextToken());

        System.out.println((sab<=240 || sab<=(ma+fab+mb))?"high speed rail":"flight");
    }
}