import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        double ans=0;
        StringTokenizer st= new StringTokenizer(br.readLine());

        while(n-->0){
            ans+=Math.pow(Double.parseDouble(st.nextToken()),3);
        }

        System.out.println(Math.cbrt(ans));
    }
}
