import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon16917 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());

        int a= Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(st.nextToken());

        int x= Integer.parseInt(st.nextToken());
        int y= Integer.parseInt(st.nextToken());

        int ans= Integer.MAX_VALUE;

        for(int i=0;i<=Math.max(x,y);i++){
            int case2= c*(2*i)+ a*Math.max(x-i,0)+ b*Math.max(y-i,0);

            ans= Math.min(ans,case2);
        }

        System.out.println(ans);
    }
}
/*
5000 5000 5000 100000 100000
 */