import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int g= Integer.parseInt(st.nextToken());
        int p= Integer.parseInt(st.nextToken());
        int t= Integer.parseInt(st.nextToken());

        int way1= g*p;
        int way2= g+p*t;

        System.out.println(way1>way2?2:(way1==way2)?0:1);
    }
}
