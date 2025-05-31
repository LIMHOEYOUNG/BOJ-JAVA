import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon13410 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        int max= 0;

        for(int i=1;i<=k;i++){
            int num= n*i;
            max= Math.max(max,Integer.parseInt((new StringBuilder().append(num).reverse()).toString()));
        }

        System.out.println(max);

    }
}
