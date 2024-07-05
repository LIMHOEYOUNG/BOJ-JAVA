import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon29736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        int k= Integer.parseInt(st.nextToken());
        int x= Integer.parseInt(st.nextToken());

        int ans=0;

        //작거나 같음 범위 k-x<=....<=k+x, x만큼 덜 맞고 x만큼 더 맞은 사람과 친구
        for(int i = k-x; i <= x+k ; i++){
            if(i<a || b<i) continue;
            ans++;
        }

        System.out.println(ans==0?"IMPOSSIBLE":ans);
    }
}
