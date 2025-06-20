import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2399 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        long point[]= new long[n];
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            point[i]= Integer.parseInt(st.nextToken());
        }

        long ans= 0;
        for(int i=0;i<point.length;i++){
            for(int j=0;j<point.length;j++){
                ans+=Math.abs(point[i]-point[j]);
            }
        }

        System.out.println(ans);
    }
}
