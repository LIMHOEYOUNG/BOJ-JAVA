import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.MissingFormatArgumentException;
import java.util.StringTokenizer;

public class Beakjoon14501 {
    private static int[][] day_pay;
    private static int n;
    private static int rst_value= 0;
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        n= Integer.parseInt(br.readLine());
        day_pay= new int[n+1][2];

        for(int i=1;i<=n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            day_pay[i][0] = Integer.parseInt(st.nextToken());
            day_pay[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=n;i++){
            calc(i,0,0);
        }

        System.out.println(rst_value);
    }

    private static int calc(int idx,int rst,int cnt){
        int max= rst;
        int s_idx= idx;

        for(int i=s_idx;i<=n;i++){
            if((idx+day_pay[i][0]-1)<=n){
               max= rst+day_pay[i][1];

               max= Math.max(max,calc((idx+day_pay[i][0]),max,cnt+1));
            }

            idx++;
        }

        rst_value= Math.max(rst_value,max);
        return Math.max(max,rst);
    }
}