import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15128 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        long p1= Long.parseLong(st.nextToken());
        long q1= Long.parseLong(st.nextToken());
        long p2= Long.parseLong(st.nextToken());
        long q2= Long.parseLong(st.nextToken());

        System.out.println(p1*p2 % (q1*q2*2)==0?1:0);
    }
}
