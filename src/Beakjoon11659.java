import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon11659 {
    public static void main(String[] args)throws IOException {
        //long beforeTime = System.currentTimeMillis();

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int[] num= new int[n+1];
        for(int i=1;i<=n;i++){
            num[i]+= num[i-1]+Integer.parseInt(st.nextToken());
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<m;i++){
            st= new StringTokenizer(br.readLine());
            int s= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());

            sb.append((num[e]-num[s-1])).append("\n");
        }

        System.out.print(sb);

        //long afterTime = System.currentTimeMillis();
        //long secDiffTime = (afterTime - beforeTime);
        //System.out.println("time diff(ms) : "+secDiffTime);
        //System.out.println("time diff(s) : "+secDiffTime/1000);
    }
}
