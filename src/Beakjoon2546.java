import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2546 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            br.readLine();

            StringTokenizer st= new StringTokenizer(br.readLine());
            int n= Integer.parseInt(st.nextToken());
            int m= Integer.parseInt(st.nextToken());

            long iq[]= new long[Math.max(n,m)];
            long sum_c= 0;
            long sum_eco= 0;

            st= new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                iq[i]= Long.parseLong(st.nextToken());
                sum_c+= iq[i];
            }

            st= new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                sum_eco+= Long.parseLong(st.nextToken());
            }

            int ans= 0;
            for(int i=0;i<n;i++){
                //c평균보다 낮고 경제평균보다 높음
                if(iq[i]*n<sum_c && iq[i]*m>sum_eco) ans++;
            }

            System.out.println(ans);
        }
    }
}
