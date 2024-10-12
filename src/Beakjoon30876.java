import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon30876 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int ansx= Integer.MAX_VALUE;
        int ansy= Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());

            int xi= Integer.parseInt(st.nextToken());
            int yi= Integer.parseInt(st.nextToken());

            if(ansy>yi){
                ansx=xi;
                ansy=yi;
            }
        }

        System.out.println(ansx+" "+ansy);
    }
}
