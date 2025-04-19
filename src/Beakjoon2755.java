import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2755 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        double ans= 0;
        int unit_total= 0;

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            String name= st.nextToken();
            int unit= Integer.parseInt(st.nextToken());
            String result= st.nextToken();

            ans+= unit*calc(result);
            unit_total+= unit;
        }

        System.out.println(String.format("%.2f",(ans/unit_total)));
    }

    public static double calc(String result){
        char alpha= result.charAt(0);
        double a=0;
        if(!(alpha=='F')) {
            a= 'E'-alpha;
            char detail= result.charAt(1);
            if(detail=='-') a-=0.3;
            else if(detail=='+') a+=0.3;
        }

        return a;
    }
}
