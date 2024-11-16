import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Beakjoon10833 {
    public static void main(String[] agrs)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans= 0;

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int students= Integer.parseInt(st.nextToken());
            int apples= Integer.parseInt(st.nextToken());

            ans+=apples%students;
        }

        System.out.println(ans);
    }
}