import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon22864 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        int f= 0;
        int ans= 0;

        for(int i=0;i<24;i++){
            if(f+a<=m){
                f+=a;
                ans+=b;
            }
            else f= Math.max((f-c),0);  //f-c<0?0:f-c;
        }

        System.out.println(ans);
    }
}
