import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon20299 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int l= Integer.parseInt(st.nextToken());
        int ans= 0;
        StringBuilder sb= new StringBuilder();

        while(n-->0){
            st= new StringTokenizer(br.readLine());
            int p1= Integer.parseInt(st.nextToken());
            int p2= Integer.parseInt(st.nextToken());
            int p3= Integer.parseInt(st.nextToken());

            if((p1+p2+p3)<k || (p1<l || p2<l || p3<l)) continue;

            ans+=1;
            sb.append(p1).append(" ").append(p2).append(" ").append(p3).append(" ");

        }

        System.out.println(ans+"\n"+sb);
    }
}
/*
14 200 100
99 100 100
100 99 100
100 100 99
99 99 100
99 100 99
100 99 99
99 99 99
100 100 101
100 101 100
101 100 100
100 101 101
101 100 101
101 101 100
101 101 101

 */
/*
3
1621 1928 1809 1600 1700 1800 1792 1617 1830

3
1621 1928 1809 1600 1700 1800 1792 1617 1830
 */