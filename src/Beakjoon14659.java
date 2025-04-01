import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14659 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());

        int check= 0;
        int max= 0;
        int h= Integer.parseInt(st.nextToken());

        while(st.hasMoreTokens()){
            int n_h= Integer.parseInt(st.nextToken());

            if(h>n_h){
                check++;
                max= Math.max(max,check);
            }
            else{
                max= Math.max(max,check);
                check= 0;
                h=n_h;
            }

        }

        System.out.println(max);
    }
}
/*
10
9 5 4 3 10 8 7 6 2 1
 */