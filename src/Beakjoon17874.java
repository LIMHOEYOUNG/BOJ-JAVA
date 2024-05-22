import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon17874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int h= Integer.parseInt(st.nextToken());
        int v= Integer.parseInt(st.nextToken());

        System.out.println(4*Math.max(n-h,h)*Math.max(n-v ,v));

    }
}
