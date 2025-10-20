import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon14173 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int max_x= Integer.MIN_VALUE;
        int min_x= Integer.MAX_VALUE;
        int max_y= Integer.MIN_VALUE;
        int min_y= Integer.MAX_VALUE;

        for(int i=0;i<2;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=1;j<=4;j++){
                int num= Integer.parseInt(st.nextToken());
                if(j%2!=0){ //x
                    min_x= Math.min(min_x,num);
                    max_x= Math.max(max_x,num);
                }
                else{   //y
                    min_y= Math.min(min_y,num);
                    max_y= Math.max(max_y,num);
                }
            }
        }

        System.out.println((int)Math.pow(Math.max((max_x-min_x),(max_y-min_y)),2));
    }
}
/*
-3 -2 -5 -5
7 7 8 8

64
36
49
64
100
49
81
64
64
 */