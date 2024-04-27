import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26307 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int hh= Integer.parseInt(st.nextToken());
        int mm= Integer.parseInt(st.nextToken());

        System.out.println(((hh-9)*60 + mm));
    }
}
