import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(br.readLine());

        double ans= (Double.parseDouble(st.nextToken()))/(Double.parseDouble(st.nextToken()));

        //System.out.println((Double.parseDouble(st.nextToken()))/(Double.parseDouble(st.nextToken())));

        while(n-->0){
            st= new StringTokenizer(br.readLine());
            ans= Math.min(ans,(Double.parseDouble(st.nextToken()))/(Double.parseDouble(st.nextToken())));
            //System.out.println((Double.parseDouble(st.nextToken()))/(Double.parseDouble(st.nextToken())));
        }

        System.out.println(String.format("%.2f\n",ans*1000));
    }
}
