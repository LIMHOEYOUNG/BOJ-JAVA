import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon27880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int ans=0;

        for(int i=0;i<4;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            String str= st.nextToken();
            int x= Integer.parseInt(st.nextToken());

            ans+= str.equals("Es")?x*21:x*17;
        }

        System.out.println(ans);
    }
}
