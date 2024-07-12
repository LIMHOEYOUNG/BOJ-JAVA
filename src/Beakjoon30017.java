import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30017 {
        public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int p= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        System.out.println(c>=p?(p+(p-1)):(c+(c+1)));
    }
}
