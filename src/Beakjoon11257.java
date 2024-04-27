import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int num= Integer.parseInt(st.nextToken());
            double test1= Double.parseDouble(st.nextToken());
            double test2= Double.parseDouble(st.nextToken());
            double test3= Double.parseDouble(st.nextToken());
            int sum= (int)(test1+test2+test3);

            sb.append(num+" ").append(sum+" ");

            if(sum<55) sb.append("FAIL\n");

                //System.out.println((test1/35)+" "+(test2/25)+" "+(test3/40));
            else {
                if ((test1 / 35 >= 0.3) && (test2 / 25 >= 0.3) && (test3 / 40 >= 0.3)) sb.append("PASS\n");
                else sb.append("FAIL\n");
            }
        }

        System.out.println(sb);
    }
}
