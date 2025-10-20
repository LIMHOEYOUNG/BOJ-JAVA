import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16479 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        long k= Long.parseLong(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        long d1= Long.parseLong(st.nextToken());
        long d2= Long.parseLong(st.nextToken());

        if(d1==d2) System.out.println((long)Math.pow(k,2));
        else{
            //double d= (Math.max(d1,d2)-Math.min(d1,d2))/2.0;
            //System.out.println(Math.sqrt(Math.pow(k,2)-Math.pow(d,2)));
            //System.out.println(Math.pow(k,2)-Math.pow((Math.max(d1,d2)-Math.min(d1,d2))/2.0 ,2));
            double ans= Math.pow(k,2)-Math.pow((Math.max(d1,d2)-Math.min(d1,d2))/2.0 ,2);
            //System.out.println(ans%1==0.0?((long)ans):ans);
            if(ans%1==0.0) System.out.println((long)ans);
            else System.out.println(ans);
        }
    }
}
