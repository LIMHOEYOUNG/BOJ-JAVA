import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon24183 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int c4= Integer.parseInt(st.nextToken());
        int a3= Integer.parseInt(st.nextToken());
        int a4= Integer.parseInt(st.nextToken());

        int c4_g= 229*324*c4*2;
        int a3_g= 297*420*a3*2;
        int a4_g= 210*297*a4;

        System.out.println(String.format("%.6f",(c4_g+a3_g+a4_g)*0.000001));
    }
}
