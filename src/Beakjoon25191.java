import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25191 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int chicken= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int cock= Integer.parseInt(st.nextToken());
        int beer= Integer.parseInt(st.nextToken());

        int a=(cock/2)+beer;

        System.out.println(Math.min(a,chicken));
    }
}
