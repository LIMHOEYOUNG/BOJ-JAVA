import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon33046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int first= Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int second= Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());

        int gadong= (first-1)%4;

        int jindong= (gadong+second-1)%4;

        System.out.println(jindong+1);

    }
}
