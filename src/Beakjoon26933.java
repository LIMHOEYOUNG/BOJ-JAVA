import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon26933 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());

        int ans= 0;

        for(int i=0;i<3;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int h= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            int k= Integer.parseInt(st.nextToken());

            ans+= h<b?(b-h)*k:0;
        }

        System.out.println(ans);
    }
}
