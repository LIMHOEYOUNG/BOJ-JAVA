import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2979 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int times[]= new int[101];
        int start_t= Integer.MAX_VALUE;
        int end_t= Integer.MIN_VALUE;

        for(int i=0;i<3;i++){
            st= new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());

            start_t= Math.min(start_t,s);
            end_t= Math.max(end_t,e);

            for(int j=s;j<e;j++){
                times[j]++;
            }
        }

        int ans= 0;
        for(int j=start_t;j<end_t;j++){
            if(times[j]==3) ans+= c*times[j];
            else if(times[j]==2) ans+= b*times[j];
            else if(times[j]==1) ans+= a*times[j];
        }

        System.out.println(ans);
    }
}
