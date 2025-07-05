import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16431 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int b_c= Integer.parseInt(st.nextToken());
        int b_r= Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int d_c= Integer.parseInt(st.nextToken());
        int d_r= Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int j_c= Integer.parseInt(st.nextToken());
        int j_r= Integer.parseInt(st.nextToken());

        int d= Math.abs(j_c-d_c)+Math.abs(j_r-d_r);
        int b= Math.min(Math.abs(j_c-b_c),Math.abs(j_r-b_r))+
                (Math.max(Math.abs(j_c-b_c),Math.abs(j_r-b_r))- Math.min(Math.abs(j_c-b_c),Math.abs(j_r-b_r)));

        System.out.println(b<d?"bessie":b==d?"tie":"daisy");
    }
}
