import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2875 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int max= 0;

        for(int i=0;i<=k;i++){
            if(n<i && m<(k-i)) continue;
            max=Math.max(max,Math.min((n-i)/2,m-(k-i)));
        }

        System.out.println(max);
    }
}
