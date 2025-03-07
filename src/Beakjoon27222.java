import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon27222 {
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int ans= 0;

        for(int i=0;i<n;i++){
            StringTokenizer st2= new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st2.nextToken());
            int y= Integer.parseInt(st2.nextToken());

            if(Integer.parseInt(st.nextToken())==1 && (y>x)) ans+=(y-x);
        }

        System.out.println(ans);
    }
}
