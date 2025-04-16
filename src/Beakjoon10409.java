import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10409 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int t= Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine());
        int ans= 0;
        int total_time= 0;

        for(int i=0;i<n;i++){
            int time= Integer.parseInt(st.nextToken());
            total_time+= time;
            if(total_time<=t) ans++;
            else break;
        }

        System.out.println(ans);
    }
}
/*
5 10
1 2 3 4 5

4
 */