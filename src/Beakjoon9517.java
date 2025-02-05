import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon9517 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k= Integer.parseInt(br.readLine());
        int n= Integer.parseInt(br.readLine());

        int time= 210;
        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int t= Integer.parseInt(st.nextToken());
            String z= st.nextToken();

            if(z.equals("P")||z.equals("N")) {
                time-=t;
                if(time<0) break;
            }
            else{
                time-=t;
                if(time<0) break;
                k++;
                if(k==9) k=1;
            }


        }

        System.out.println(k);
    }
}
