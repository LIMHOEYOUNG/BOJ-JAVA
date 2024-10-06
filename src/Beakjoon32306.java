import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon32306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int team1= Integer.parseInt(st.nextToken())+2*Integer.parseInt(st.nextToken())+3*Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int team2= Integer.parseInt(st.nextToken())+2*Integer.parseInt(st.nextToken())+3*Integer.parseInt(st.nextToken());

        System.out.println(team1==team2?0:team1>team2?1:2);

    }
}
