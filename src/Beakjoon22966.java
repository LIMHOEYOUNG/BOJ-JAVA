import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon22966 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int min_lev= Integer.MAX_VALUE;
        String ans="";

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            String problem= st.nextToken();
            int lev= Integer.parseInt(st.nextToken());

            if(lev<min_lev) {
                ans= problem;
                min_lev= lev;
            }
        }

        System.out.println(ans);
    }
}
