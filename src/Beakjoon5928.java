import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon5928 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int d= Integer.parseInt(st.nextToken());
        int h= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        int time = 11*60*24 + 11*60 + 11;
        int provide_time = d*60*24 + h*60 + m;

        System.out.println(provide_time-time<0? -1: provide_time-time);
    }
}
