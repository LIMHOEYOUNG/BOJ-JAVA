import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        for(int i=1;;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            double diameter= Double.parseDouble(st.nextToken());
            int n= Integer.parseInt(st.nextToken());
            double time= Double.parseDouble(st.nextToken());

            if(n==0) break;

            double dis= (diameter/63360)* 3.1415927*n;
            double ans= dis/time*3600;

            //sb.append("Trip #"+i+": "+dis+" "+ans+"\n");
            sb.append("Trip #"+i+": "+String.format("%.2f %.2f\n",dis,ans));
        }

        System.out.println(sb);
    }
}
