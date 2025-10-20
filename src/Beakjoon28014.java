import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon28014 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int ans= 1;
        int before_val= Integer.parseInt(st.nextToken());

        for(int i=1;i<n;i++){
            int h= Integer.parseInt(st.nextToken());
            if(before_val<=h){
                ans++;
            }

            before_val=h;
        }

        System.out.println(ans);
    }
}
/*
5
5 4 3 2 1
 */