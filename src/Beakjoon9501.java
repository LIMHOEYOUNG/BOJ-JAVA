import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9501 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int cnt= 0;

            int n= Integer.parseInt(st.nextToken());
            int d= Integer.parseInt(st.nextToken());

            for(int i=0;i<n;i++){
                st= new StringTokenizer(br.readLine());
                double v= Double.parseDouble(st.nextToken());
                double f= Double.parseDouble(st.nextToken());
                double c= Double.parseDouble(st.nextToken());

                if((v*(f/c))>=d) cnt++;
            }

            sb.append(cnt+"\n");
        }

        System.out.println(sb);
    }
}
