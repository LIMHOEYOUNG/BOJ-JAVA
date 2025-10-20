import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon15734 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int l= Integer.parseInt(st.nextToken());
        int r= Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());
        int ans= 0;

        if(l==r) ans=(a%2==0?a:a-1)+l+r;
        else{
            int max= Math.max(l,r);
            int min= Math.min(l,r);
            ans+= (max-min)<=a?max*2:min*2;

            //System.out.println("ans + "+((max-min)<=a?max*2:min*2));
            //System.out.println((max-min));
            //System.out.println(a);
            //System.out.println((max-min)<a);

            if((max-min)<a){
                a-=(max-min);
                ans+= (a<=1)?0:(a%2==0)?a:a-1;

                //System.out.println("if"+((a<=1)?0:(a%2==0)?a:a-1));
            }
            else if((max-min)>a){
                ans+=(2*a);

                //System.out.println("else if"+(2*a));
            }
        }

        System.out.println(ans);
    }
}
