import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ans=0;
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w= Integer.parseInt(st.nextToken());
            int l= Integer.parseInt(st.nextToken());

            switch (w){
                case 136:
                    ans+=1000;
                    break;
                case 142:
                    ans+=5000;
                    break;
                case 148:
                    ans+=10000;
                    break;
                case 154:
                    ans+=50000;
                    break;
            }
        }

        System.out.println(ans);
    }
}
