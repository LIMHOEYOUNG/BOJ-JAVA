import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb= new StringBuilder();

        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine());

            double m= Double.parseDouble(st.nextToken());
            double a= Double.parseDouble(st.nextToken());
            double b= Double.parseDouble(st.nextToken());

            if(m==0 & a==0 && b==0) break;

            double ans= Math.round(((m/a)-(m/b)) * 3600);

            int hh= (int)(ans/3600);
            int mm= (int)((ans/60)%60);
            int ss= (int)(ans%60);

            sb.append(String.format("%d:%02d:%02d\n", hh, mm, ss));
        }

        System.out.println(sb);
    }
}
