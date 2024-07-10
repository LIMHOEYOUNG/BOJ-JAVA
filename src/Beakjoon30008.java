import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            //int i= Integer.parseInt(st.nextToken());

            int i = (Integer.parseInt(st.nextToken())*100)/n;
            if(0<= i && i<=4) sb.append(1+" ");
            else if(4<i && i<= 11) sb.append(2+" ");
            else if(11<i && i<= 23) sb.append(3+" ");
            else if(23<i && i<= 40) sb.append(4+" ");
            else if(40<i && i<= 60) sb.append(5+" ");
            else if(60<i && i<= 77) sb.append(6+" ");
            else if(77<i && i<= 89) sb.append(7+" ");
            else if(89<i && i<= 96) sb.append(8+" ");
            else if(96<i && i<= 100) sb.append(9+" ");
        }

        System.out.println(sb);
    }
}
