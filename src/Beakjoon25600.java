import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25600 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int max= Integer.MIN_VALUE;

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int d= Integer.parseInt(st.nextToken());
            int g= Integer.parseInt(st.nextToken());
            int check=a*(d+g)*(a==(d+g)?2:1);

            max=Math.max(check,max);
        }

        System.out.println(max);
    }
}
