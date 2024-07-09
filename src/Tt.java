import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tt {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        double to= 0.0;
        for(double i=0;i<0.8;i+=0.1){
            double ans = 0.2 + 25*i - 200*Math.pow(i,2) + 675*Math.pow(i,3) - 900*Math.pow(i,4) + 400*Math.pow(i,5);
            System.out.println(String.format("%.4f",ans));

            to+=(i==0.0 || i==0.8?ans:2*ans);

            //System.out.println("i = "+i+" ans = " +ans);
        }

        System.out.println("answer = "+to);
    }
}
