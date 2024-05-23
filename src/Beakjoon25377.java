import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        int check= Integer.MAX_VALUE;

        while(n-->0){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            if(a<=b){
                check=Math.min(check,b);
            }
        }

        System.out.println(check==Integer.MAX_VALUE?-1:check);
    }
}
